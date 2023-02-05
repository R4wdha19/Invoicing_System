import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Constants {
	public static final String url = "";
	public static final String user = "";
	public static final String pass = "";
	public static Connection con;
	public static Scanner scanner = new Scanner(System.in);

	public static void establishADataBaseConnection() {

		System.out.println("To Start Saving Your Data, We Need To Connect To The Data Base,"
				+ " Help Us By Providing The Following");
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

	public static void establishADataBaseConnectionWithTablesCreation() {

		System.out.println("To Start Saving Your Data, We Need To Connect To The Data Base,"
				+ " Help Us By Providing The Following");
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
		CreatingTables.creatingEmptyTable();

	}

	public static void closingConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static ResultSet executingOfQurey(String sql) {
		ResultSet executing = null;
		try {
			Statement st = con.createStatement();
			executing = st.executeQuery(sql);

			System.out.println("Successful : " + sql);

		} catch (Exception ex) {

			System.err.println(ex);
		}
		return executing;

	}

	public static void executingOfUpdate(String sql) {

		try {
			Statement st = con.createStatement();
			int executing = st.executeUpdate(sql);
			System.out.println(sql);
			if (executing > 0) {
				System.out.println("Successful : " + sql);
			} else {
				System.out.println("Failed");
			}
		} catch (Exception ex) {

			System.err.println(ex);
		}

	}

	public static void showMenu(Integer choice) {
		List<String> mainMenu = Arrays
				.asList(" Welcome To Our Invoicing System, These Are The Services That Our System Provide:/r/n"
						+ " 0 - Start By Establishing A DataBase Connection To Load Your Data /r/n "
						+ " 1 - Shop Settings /r/n" + " 2 - Shop Management /r/n" + " 3 - Create A New Invoice /r/n "
						+ " 4 - Get Reports /r/n" + " 5 - Search An Invoice /r/n " + " 6 - Program Statistics  /r/n"
						+ " 7 - Exit /r/n");

		List<String> menuForShopSettings = Arrays
				.asList("Here Are The Settings Of Our System, Please Choose What You Want To Do :\r\n"
						+ "	 1 - Add A New Shop \r\n" + "	 2 - Load The Shop Data \r\n"
						+ "	 3 - Add A New Shop Header \r\n" + "	 4 - Set The Invoice Header \r\n"
						+ "	 5 - Go Back To The Main Menu");
		List<String> menuForShopManagment = Arrays.asList("What Would Like To Manage ?" + "1 - Add An Item "
				+ "2 - Delete An Item " + "3 - Change The Price Of An Item" + "4 - Go Back To Main Menu ");
		List<String> menuForPrintingReports = Arrays
				.asList(" What Report You Would Like To See ? " + " 1 - The Shop Statistics " + " 2 - All The Invoices "
						+ " 3 - All Shop Customers " + " 4 - All Shop Items" + " 5 - Go Back To Main Menu ");
		switch (choice) {
		case 1:
			showList(mainMenu);
			break;
		case 2:
			showList(menuForShopSettings);
			break;
		case 3:
			showList(menuForShopManagment);
			break;
		case 4:
			showList(menuForPrintingReports);
			break;

		}

	}

	public static void showList(List<String> stringList) {
		for (String m : stringList) {
			System.out.println(m);
		}
	}

}