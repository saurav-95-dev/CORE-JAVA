//INSERTING VALUES INTO DB USING PREPARED STATEMENT(When the query is fixed and the values are dynamic)
package com.dev.learning;

import java.sql.*;

class DemoClass{
    public static void main(String[] args) throws Exception {
        System.out.println("INSERTION IN DB VIA JDBC:");
        System.out.println();
        String username = "root";
        String password = "Saurabh@123";
        String query = "select * from worker";
        String url = "jdbc:mysql://localhost:3306/org";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt(1) +" : " + rs.getString(2)+"  "+rs.getString(3));
        }
        st.close();
        con.close();
    }
}