import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Constants {
	public static final String url = "";
	public static final String user = "";
	public static final String pass = "";
	public static Connection con;
	public static Scanner scanner = new Scanner(System.in);

	public static void establishADataBaseConnection() {

		System.out.println("To Start Saving Your Data, We Need To Connect To The Data Base,"
				+ "/t /n Help Us By Providing The Following");
		System.out.println(" What Is The Name Of Your DataBase ?");
		String dataBaseName = scanner.next();
		System.out.println(" What Is The UserName Of Your DataBase ?");
		String dataBaseUserName = scanner.next();
		System.out.println(" What Is The PassWord Of Your DataBase ?");
		String dataBasePassWord = scanner.next();
		String url = "jdbc:sqlserver://localhost:1433;databaseName=" + dataBaseName
				+ ";encrypt=true;trustServerCertificate=true";
		String user = dataBaseUserName;
		String pass = dataBasePassWord;

		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void closingConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
