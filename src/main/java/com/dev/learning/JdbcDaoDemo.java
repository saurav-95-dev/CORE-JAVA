//DAO-Data-Access-Object-Basic Theory:
/*
->It is a design pattern that separates database logic from business logic.
->DAO is basically a class whose only job is to talk to the database.
*/
package com.dev.learning;

import java.sql.*;

class JdbcDaoDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("DAO-Design Pattern");
        StudentDao studentDao = new StudentDao();
        Student s1 = studentDao.getStudent(1);
        System.out.println(s1.first_name);
    }
}

class StudentDao{
    public Student getStudent(int worker_id) throws Exception {
        String query = "select * from worker where worker_id = " +  worker_id;
        Student s = new Student();
        s.worker_id = worker_id;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "Saurabh@123");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        s.first_name = rs.getString("first_name");


        return s;
    }
}

class Student{
    //Contains 2 attributes:
    String first_name;
    int worker_id;
}