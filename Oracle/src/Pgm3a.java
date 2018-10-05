import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pgm3a {

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
			while(res.next()==true)
			{
				String a=res.getString("NAME");
				String b=res.getString("USN");
				String c=res.getString("SEM");
				System.out.println(a+" "+b+" "+c);
				
			}
			
		}
		catch (Exception e) {
			System.out.println("probs");
			e.printStackTrace();
		}
	}

}
