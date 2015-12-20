
 import java.sql.*;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection 
{
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DBConnection ()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                        pst=con.prepareStatement("select * from adlogin where UserName=? and Password=?");
             
           }
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e);
        }
    }
    public Boolean checkLogin(String UserName,String Password)
    {
        try {
                        
            pst.setString(1, UserName); //this replaces the 1st  "?" in the query for username
            pst.setString(2, Password);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            System.out.println(UserName + Password);
            rs=pst.executeQuery();
            return rs.next(); //TRUE iff the query founds any corresponding data
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
}
}
