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
}

class Employee{
    String first_name;
    String last_name;
    int worker_id;
}
