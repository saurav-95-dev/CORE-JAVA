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
        studentDao.connect();   // ✅ FIRST

        // FETCH
        Student s1 = studentDao.getStudent(67);
        System.out.println(s1.first_name);

        // ADD
        Student s2 = new Student();
        s2.first_name = "John";
        s2.worker_id = 69;
        studentDao.addStudent(s2);

        // REMOVE
        studentDao.removeStudent(68);
    }
}

class StudentDao {

    Connection con;

    public void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/org",
                "root",
                "Saurabh@123"
        );
    }

    public Student getStudent(int worker_id) throws Exception {

        String query = "SELECT * FROM worker WHERE worker_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, worker_id);

        ResultSet rs = ps.executeQuery();
        Student s = new Student();

        if (rs.next()) {
            s.worker_id = rs.getInt("worker_id");
            s.first_name = rs.getString("first_name");
        }

        rs.close();
        ps.close();
        return s;
    }

    public void addStudent(Student s) throws Exception {

        String query = "INSERT INTO worker(worker_id, first_name) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, s.worker_id);
        ps.setString(2, s.first_name);

        ps.executeUpdate();
        ps.close();
    }

    public void removeStudent(int worker_id) throws Exception {

        String query = "DELETE FROM worker WHERE worker_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, worker_id);

        int rows = ps.executeUpdate();
        System.out.println(rows + " student(s) removed.");

        ps.close();
    }
}

class Student{
    //Contains 2 attributes:
    String first_name;
    int worker_id;
}