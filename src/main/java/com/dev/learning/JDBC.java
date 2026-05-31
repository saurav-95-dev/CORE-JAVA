package  com.dev.learning;
import java.sql.*;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1st Step(Load and Register the Driver) will be written inside JDBCUtil.java itself(inside static block).
        Connection con = null;
        Statement st = null;
        PreparedStatement ps = null;
        //Handling exception:
        try{
            con = JDBCUtil.getConnection(); //logic written inside utility class
            //Create statement :
            //st = con.createStatement();
            //using prepared statement:
            ps = con.prepareStatement("insert into Student(id , sname , sage ,scity) values(?,?,?,?)");
            System.out.println("Enter the following details:");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student ID");
            int id = sc.nextInt();
            System.out.println("Enter Student Name");
            String sname = sc.next();
            System.out.println("Enter Student Age");
            int sage = sc.nextInt();
            System.out.println("Enter city name");
            String scity = sc.next();
            //using preapredStatement to insert value at run-time:
            ps.setInt(1, id);
            ps.setString(2, sname);
            ps.setInt(3, sage);
            ps.setString(4, scity);


            boolean status = ps.execute();
            if(status){ //means there is only data retrieval
                ResultSet rs = st.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));

                }
            }
            else{ //means there is data manipulation
                int rows = ps.getUpdateCount();
                if (rows == 0) {
                    System.out.println("Operation failed");
                }else{
                    System.out.println("Operation successful");
                }
            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            //for resource cleaning
            try{
                //resource closing :
                JDBCUtil.closeConnection(ps , con);
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
}