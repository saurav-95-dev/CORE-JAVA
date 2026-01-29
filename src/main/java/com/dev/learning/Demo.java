//JAVA-JDBC :
package com.dev.learning;

import java.sql.*;

class Demo{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123";
        String query = "Select * from Worker";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , username , password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        String userData = "";
        while(rs.next()){
            userData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }

        st.close();
        con.close();

    }
}