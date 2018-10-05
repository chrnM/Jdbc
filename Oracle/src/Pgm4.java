import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Pgm4 {

	public static void main(String[] args) {


		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="0404";
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		PreparedStatement ps=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("loaded");
			con= DriverManager.getConnection(url, un, pw);
			System.out.println("connection estblished");
			String s="SELECT * FROM ABC WHERE NAME=?";
			ps=con.prepareStatement(s);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the name");
			String temp=scan.next();
			ps.setString(1, temp);
			res=ps.executeQuery();
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
