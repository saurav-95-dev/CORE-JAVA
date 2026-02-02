//DAO-Operations - Fetch , Add , Manipulate , Delete
/*
->There will be a class in which all database-logic will be there--Dao class
 */
package com.dev.learning;

import java.sql.*;
import java.sql.DriverManager;

class EmployeeDaoDemo{
    public static void main(String[] args) throws Exception {
        EmployeeDao e = new EmployeeDao(); //create an object of Dao-class
        e.connect(); //First make connection of this dao object with DB.
        Employee s1 = e.getEmployee(2);
        System.out.println(s1.first_name + " " + s1.last_name);
        //Adding a new record:
        System.out.println("Adding a new employee:");
        Employee s2 = e.addEmployee(70 , "Bhoot" , "Nath");
        System.out.println(s2.first_name + " " + s2.last_name + " has been added");
    }
}

class EmployeeDao{
    Connection con = null;
    //here define all relevant DB-fetch related method and DB Connection:
    public void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/org" , "root" , "Saurabh@123");
    }

    public Employee getEmployee(int worker_id) throws Exception {
        Employee e = new Employee();
        e.worker_id = worker_id;
        String query = "select * from worker where worker_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, worker_id);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            e.worker_id = rs.getInt("worker_id");
            e.first_name = rs.getString("first_name");
            e.last_name = rs.getString("last_name");
        }
        rs.close();
        ps.close();

        return e;
    }

    public Employee addEmployee(int worker_id , String first_name , String last_name) throws Exception {
        Employee e = new Employee();
        e.worker_id = worker_id;
        e.first_name = first_name;
        e.last_name = last_name;
        String query = "insert into worker (first_name, last_name) values (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, first_name);
        ps.setString(2, last_name);
        ps.executeUpdate();
        ps.close();
        return e;
    }
}

class Employee{
    String first_name;
    String last_name;
    int worker_id;
}
