//7 Steps to connect JAVA Application with the Database.
/*
1->Import the package. --> java.sql.*
2->Load & Register the driver.
a)Load the driver. -->driver for mysql is : com.mysql.jdbc.driver
b)Register the driver. --> forName("com.mysql.jdbc.driver")
3->Establish the connection.-->instantiate the 'Connection' Interface
4->Create the Connection. --> Normal statement , prepare statement , callable statement
5->Execute the query.
6->Process the Result.
7->Close.
*/
package com.dev.learning;
import java.sql.*;


class DemoClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "";
        String query  = "select * from worker where Worker_id = 1";
        Class.forName("com.mysql.cj.jdbc.Driver"); //Responsible for loading the class.
        Connection con = DriverManager.getConnection(url , username,password);
        Statement st  =  con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name =  rs.getString(username);
        System.out.println(name);
        st.close();
        con.close();
        

    }
}

