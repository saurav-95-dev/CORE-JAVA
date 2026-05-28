package  com.dev.learning;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;
        Statement st = null;
        //Handling exception:
        try{
            //1)Load and Register the driver:
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2)Establishing the connection:
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "Saurabh@123"; // your real password
            con = DriverManager.getConnection(url, username, password);
            //Create statement :
            st = con.createStatement();
            //execute logic :
            //common method for CRUD in JDBC :
            String query = "insert into Student values (3 , 'Mukund' , 44 , 'Noida')";
            boolean status = st.execute(query);
            if(status){
                ResultSet rs = st.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));

                }
            }
            else{
                int rows = st.getUpdateCount();
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
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            //resource closing :
            st.close();
            con.close();
        }
    }
}