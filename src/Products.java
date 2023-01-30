import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Products {
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

	public static void productsDetails() {

		System.out.println(" Enter The Number Of Products You Would Like To Add ");
		int numberOfProducts = scanner.nextInt();
		for (int i = 0; i < numberOfProducts; i++) {
			System.out.println(" What Is The Product Name ?");
			String productName = scanner.next();
			System.out.println(" What Is The Product Price ?");
			int productPrice = scanner.nextInt();
			System.out.println(" What Is The Proudct Available Quantity ?");
			int productAvailableQuantity = scanner.nextInt();
			System.out.println(" What Is The Quantity Price ?");
			int productQuantityPrice = scanner.nextInt();

			String sqlQueryToInsert = "  INSERT INTO Items (itemName,unitPrice,quantity,quantityAmount)" + " VALUES ( '"
					+ productName + "'," + " ' " + productPrice + "','" + productAvailableQuantity + "'" + ",'"
					+ productQuantityPrice + "'" + ") ";
			try {
				Statement st = con.createStatement();
				int executing = st.executeUpdate(sqlQueryToInsert);
				if (executing >= 0) {
					System.out.println("Inserted Successfully : " + sqlQueryToInsert);
				} else {
					System.out.println(" Failed To Insert");
				}

//                closingConnection();
			} catch (Exception ex) {

				System.err.println(ex);
			}
		}

	}

}
