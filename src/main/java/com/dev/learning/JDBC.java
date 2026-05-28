package  com.dev.learning;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;
        Statement st = null;
        //Handling exception:
        try{

            con = JDBCUtil.getConnection();
            //Create statement :
            st = con.createStatement();
            //execute logic :
            //common method for CRUD in JDBC :
            String query = "insert into Student values (4 , 'Mudit' , 23 , 'NCR')";
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
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                //resource closing :
                JDBCUtil.closeConnection(st , con);
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
}