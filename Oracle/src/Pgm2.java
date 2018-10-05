import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Pgm2 {

	public static void main(String[] args) 
	{
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
				String a=res.getString(1);
				String b=res.getString(2);
				int c=res.getInt(3);
				System.out.println(a+" "+b+" "+c);
				
			}
			
		}
		catch (Exception e) {
			System.out.println("probs");
			e.printStackTrace();
		}
		
		
	
	
		
	}

}
