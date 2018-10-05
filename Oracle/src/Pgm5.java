import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Pgm5 {

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
			String s="INSERT INTO ABC VALUES(?,?,?)";
			ps=con.prepareStatement(s);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the name");
			String temp=scan.next();
			System.out.println("enter the USN");
			String temp1=scan.next();
			System.out.println("enter the sem");
			int temp2=scan.nextInt();
			ps.setString(1, temp);
			ps.setString(2, temp1);
			ps.setInt(3,temp2);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}

}
