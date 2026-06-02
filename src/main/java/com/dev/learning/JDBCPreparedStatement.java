package com.dev.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class JDBCPreparedStatement {
    public static void main(String[] args)  {
          Connection con = null;
          PreparedStatement ps = null;
          try{
              //Step-1 : Create connection:
              con = UtilityJDBCPreparedStatement.getConnection();
              ps = con.prepareStatement("insert into student (id , sname ,sage ,scity) values(? ,? ,? ,?)");
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter ID: ");
              int id = sc.nextInt();
              sc.nextLine();

              System.out.print("Enter Name: ");
              String sname = sc.nextLine();

              System.out.print("Enter Age: ");
              int sage = sc.nextInt();
              sc.nextLine();

              System.out.print("Enter City: ");
              String scity = sc.nextLine();
              ps.setInt(1, id);
              ps.setString(2, sname);
              ps.setInt(3, sage);
              ps.setString(4, scity);
              boolean status = ps.execute();
              if(status){
                  ResultSet rs = ps.getResultSet();
                  while(rs.next()){
                      System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3));

                  }
              }
              else{
                  int rows = ps.getUpdateCount();
                  System.out.println(rows + " rows updated");
                  if(rows==0){
                      System.out.println("No rows updated");
                  }
                  else{
                      System.out.println("rows updated successfully" );
                  }

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