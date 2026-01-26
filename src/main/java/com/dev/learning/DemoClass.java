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
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); //Responsible for loading the class.



    }
}

