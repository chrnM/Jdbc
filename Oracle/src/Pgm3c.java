import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Pgm3c {

	public static void main(String[] args) {
		
	
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="0404";
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("loaded");
			con= DriverManager.getConnection(url, un, pw);
			System.out.println("connection estblished");
			String s="SELECT * FROM ABC";
			stmt=con.createStatement();
			res=stmt.executeQuery(s);
			ResultSetMetaData rs=res.getMetaData();
			for(int i=1;i<=rs.getColumnCount();i++)
			{
				System.out.println(rs.getColumnName(i)+" "+rs.getColumnTypeName(i));
			}
			while(res.next()==true)
			{
				String a=res.getString("NAME");
				String b=res.getString("USN");
				String c=res.getString("SEM");
				System.out.println(a+" "+b+" "+c);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

}
}
