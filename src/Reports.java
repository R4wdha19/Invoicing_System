import java.sql.ResultSet;
import java.util.Scanner;

public class Reports {
	static Scanner scanner = new Scanner(System.in);

	public static void reportsMenu() {
		System.out.println(" What Report You Would Like To See ? ");
		System.out.println(" 1 - The Shop Statistics ");
		System.out.println(" 2 - All The Invoices ");
		System.out.println(" 3 - All Shop Customers ");
		System.out.println(" 4 - All Shop Items");
		System.out.println(" 5 - Go Back To Main Menu ");

	}

	public static void reportOfShopStatistics() {
		System.out.println(" What Is The Shop Id ? ");
		int shopIdFromInput = scanner.nextInt();
		String sqlQueryToPrintReport = "SELECT * FROM shop where InvoiceId =" + shopIdFromInput;

		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
	}

	public static void reportOfShopInvoices() {
		String sqlQueryToPrintReport = "SELECT * FROM Invoice";

		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
	}

	public static void reportOfShopCustomers() {
		String sqlQueryToPrintReport = "SELECT * FROM Customers";
		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
	}

	public static void reportOfShopItems() {
		String sqlQueryToPrintReport = "SELECT * FROM Items ";
		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
	}

}