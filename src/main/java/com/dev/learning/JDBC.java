package com.dev.learning;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String uname = "root";
        String pass = "Saurabh@123";

        Connection con = DriverManager.getConnection(url, uname, pass);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while(rs.next()) {

            int id = rs.getInt("id");
            String name = rs.getString("sname");

            System.out.println(id + " " + name);
        }

        con.close();
    }
}