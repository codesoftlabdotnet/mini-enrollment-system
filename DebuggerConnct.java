
 import java.sql.*;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DebuggerConnct {
    
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DebuggerConnct ()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                        pst=con.prepareStatement("select * from studentstab where SrStudentId=? and password1=? and Status='Active'");
             
           }
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e);
        }
    }
    
    
    
                public Boolean DebugUser(String SrStudentId,String password1)
    {
        try {
                        
            pst.setString(1, SrStudentId); //this replaces the 1st  "?" in the query for username
            pst.setString(2, password1);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            System.out.println(SrStudentId + password1);
            rs=pst.executeQuery();
            return rs.next(); //TRUE iff the query founds any corresponding data
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
}
}

