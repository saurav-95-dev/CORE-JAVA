package com.dev.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCPreparedStatement {
    public static void main(String[] args)  {
          Connection con = null;
          PreparedStatement ps = null;
          try{
              //Step-1 : Create connection:
              con = UtilityJDBCPreparedStatement.getConnection();
              ps = con.prepareStatement("Update Student set sage = 0 where id = 8");
              boolean status = ps.execute();
              if(status){
                  ResultSet rs = ps.getResultSet();
                  while(rs.next()){
                      System.out.println(rs.getInt(1));
                      System.out.println(rs.getString(2));
                      System.out.println(rs.getInt(3));
                      System.out.println(rs.getString(4));
                  }
              }
              else{
                  System.out.println("Operation Successful");
              }
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
          catch(Exception e){
              e.printStackTrace();
          }
          finally{
             try{
                 UtilityJDBCPreparedStatement.closeConnection(ps , con);
             }
             catch(Exception e){
                 e.printStackTrace();
             }
          }


    }
}