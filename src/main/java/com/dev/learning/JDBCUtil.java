package com.dev.learning;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    static{
        //1)Load and Register the driver:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection(){
        //2)Establishing the connection:
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        con = DriverManager.getConnection(url, username, password);
    }
}