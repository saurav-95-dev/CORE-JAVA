//DAO-Data-Access-Object-Basic Theory:
/*
->It is a design pattern that separates database logic from business logic.
->DAO is basically a class whose only job is to talk to the database.
*/
//FETCHING , ADDING , AND REMOVING DATA:
package com.dev.learning;

import java.sql.*;

class JdbcDaoDemo {
    public static void main(String[] args) throws Exception {
        StudentDao studentDao = new StudentDao();
        Student s1 = studentDao.getStudent(67);
        System.out.println(s1.first_name);
        System.out.println("Adding a new student entry:");
        Student s2 = new Student();
        s2.first_name = "John";
        s2.worker_id = 68;
        studentDao.connect();
        studentDao.addStudent(s2);
    }
}

class StudentDao{

    Connection con = null;

    public void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "Saurabh@123");
    }
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

    public void addStudent(Student s) throws Exception {
        String query = "insert into worker(worker_id,first_name) values (?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.worker_id);
        p.setString(2, s.first_name);
        p.executeUpdate();
    }
}

class Student{
    //Contains 2 attributes:
    String first_name;
    int worker_id;
}