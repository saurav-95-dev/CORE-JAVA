//JDBC-Core Concepts-REV:
//STEPS TO CONNECT JAVA APPLICATION TO THE DB:
/*
1->Import the package -->java.sql.*
2->Load & Register the driver.
a)Load driver - For mysql , we need driver from mysql-connector
b)Register the driver - Class.forName("name of the driver")
3->Establish Connection. - Use the interface called Connection.
4->Create the statement. (statement , prepared statement , callable statement)
5->Execute the query.
6->Process the Result.
7->Close
*/

package com.dev.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DemoClass{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        String query = "select * from Worker";
        String newQuery1 = "INSERT INTO Worker VALUES\n" +
                "(64, 'New', 'Entry', 50000, NOW(), 'Intern');";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(query);
        int count = st.executeUpdate(newQuery1);
//        while (rs.next()) {
//            int id = rs.getInt(1);
//            String fname = rs.getString(2);
//            String lname = rs.getString(3);
//            System.out.println(id + " : " + fname + " " + lname);
//        }
        System.out.println("Inserting one new value:");
        System.out.println(count + " rows affected");
        con.close();
        st.close();

    }
}