//JAVA-JDBC :
//Inserting value into DB:
package com.dev.learning;

import java.sql.*;

class Demo{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123";
        String query = "INSERT INTO worker (first_name, last_name, salary, joining_date, department)\n" +
                "VALUES \n" +
                "  ('NEW', 'COMER', 2122, '2020-10-21 09:00:00', 'JAVA-DEVELOPER')";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , username , password);
        Statement st = con.createStatement();
        int count  = st.executeUpdate(query);
//        String userData = "";
//        while(rs.next()){
//            userData = rs.getInt(1) + " : " + rs.getString(2);
//            System.out.println(userData);
//        }
        System.out.println(count + " Rows Affected");

        st.close();
        con.close();

    }
}