
package jdbcproject;
import java.sql.*;
public class JdcDemo {

	public static void main(String[] args) throws SQLException{
		String host="localhost";
		String port="3306";
		
				
        Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/student","root","Root@1234");
        Statement s=con.createStatement();
        ResultSet rs= s.executeQuery("select * from studentinfo");
       while( rs.next())
       {
        System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4));
       }
	}

}
