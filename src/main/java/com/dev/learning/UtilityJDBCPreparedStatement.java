package com.dev.learning;
//In this uility class we will do 2 things -> Create connection and close the resource.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class UtilityJDBCPreparedStatement {
     static{
         //Step1:load and register the driver:
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
     }
     //now define getConnection method :
    public static Connection getConnection() throws SQLException {
           String url = "jdbc:mysql://localhost:3306/jdbclearning";
           String username = "root";
           String password = "Saurabh@123";
           return DriverManager.getConnection(url, username, password);

    }
    public static void closeConnection(Statement ps, Connection con) throws SQLException {
         ps.close();
         con.close();
    }
}