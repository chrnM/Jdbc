
public class Pgm1B {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("loaded");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
