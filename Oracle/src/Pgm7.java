import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Pgm7 {

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
			String s="UPDATE ABC SET NAME=? WHERE NAME=?";
			ps=con.prepareStatement(s);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the OLD name");
			String temp=scan.next();
			System.out.println("enter the NEW NAME");
			String temp1=scan.next();
			ps.setString(1, temp1);
			ps.setString(2, temp);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}

}
