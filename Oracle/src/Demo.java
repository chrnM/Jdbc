import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class Demo {

	public static void main(String[] args) {
			try {
				DriverManager.registerDriver(new OracleDriver());
				System.out.println("loaded succesfully");
			} 
			catch (SQLException e) {
				System.out.println(" Not loaded succesfully");
				e.printStackTrace();
			}
	}

}
