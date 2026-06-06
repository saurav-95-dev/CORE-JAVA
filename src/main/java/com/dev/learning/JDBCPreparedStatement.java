package com.dev.learning;

import java.sql.*;

//PERFORMING CRUD OPERATION IN JDBC VIA UTILITY CLASS VIA PREPARED-STATEMENT:
class JDBCPreparedStatement {
    public static void main(String[] args) {
        //INSERTION OPERATION (non-select operation) VIA PREPARED STATEMENT:
        Connection con = null;
        PreparedStatement ps = null;
        try{
            //Step:1 Load and register the driver and get the connection:
            con = UtilityJDBCPreparedStatement.getConnection();
            ps = con.prepareStatement("insert into Student values (10 , 'Pandu' , 11 , 'Banglore')"); //Directly pass query here
            boolean status = ps.execute();
            if(status){
                //means it's data retrieval
                ResultSet rs = ps.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getInt(3));
                    System.out.println(rs.getString(4));
                }

            }
            else{
                //it's data manipulation:
                int rows = ps.getUpdateCount();
                if(rows==0){
                    System.out.println("No rows affected");
                }
                else{
                    System.out.println("Rows affected: "+rows + " Operation Successful");
                }
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                UtilityJDBCPreparedStatement.closeConnection(con, ps);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}