import java.sql.ResultSet;
import java.sql.SQLException;
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
	// 4- Report: Statistics (No Of Items, No of Invoices, Total Sales)

	public static void reportOfShopStatistics() {
		System.out.println(" What Is The Invoice Id ? ");
		int invoiceIdFromInput = scanner.nextInt();
		String sqlQueryToPrintReport = "SELECT numberOfItems,totalAmount FROM Invoice where InvoiceId ="
				+ invoiceIdFromInput;
		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
		try {
			while (results.next()) {
				int invoiceId = results.getInt("InvoiceId");
				int customerId = results.getInt("CustomerId");
				int shopId = results.getInt("shopId");
				String invoiceDate = results.getString("invoiceDate");
				int numberOfItems = results.getInt("numberOfItems");
				int totalAmount = results.getInt("totalAmount");
				int paidAmount = results.getInt("paidAmount");
				int balance = results.getInt("balance");
				int shopContactNumber = results.getInt("shopContactNumber");
				int shopFaxNumber = results.getInt("shopFaxNumber");
				String shopEmail = results.getString("shopEmail");
				String shopWebsite = results.getString("shopWebsite");
				System.out.println(" The Invoice Id Is: " + invoiceId + " The Customer Id Is :" + customerId
						+ " The Shop Id Is :" + shopId + " The Date Is :" + invoiceDate
						+ " The Number Of Items Purshased : " + numberOfItems + " The Total Amount Is : " + totalAmount
						+ " The Amount Paid By The Customer : " + paidAmount + " The Remaining Amount " + balance
						+ " The Shop Contact Number :" + shopContactNumber + " The Shop Fax Number " + shopFaxNumber
						+ " The Shop Email Address : " + shopEmail + " The Shop Website Address : " + shopWebsite);
			}

		} catch (SQLException e) {

		}
	}

	public static void reportOfShopInvoices() {
		String sqlQueryToPrintReport = "SELECT * FROM Invoice";

		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
		try {
			while (results.next()) {
				int invoiceId = results.getInt("InvoiceId");
				int customerId = results.getInt("CustomerId");
				int shopId = results.getInt("shopId");
				String invoiceDate = results.getString("invoiceDate");
				int numberOfItems = results.getInt("numberOfItems");
				int totalAmount = results.getInt("totalAmount");
				int paidAmount = results.getInt("paidAmount");
				int balance = results.getInt("balance");
				int shopContactNumber = results.getInt("shopContactNumber");
				int shopFaxNumber = results.getInt("shopFaxNumber");
				String shopEmail = results.getString("shopEmail");
				String shopWebsite = results.getString("shopWebsite");
				System.out.println(" The Invoice Id Is: " + invoiceId + " The Customer Id Is :" + customerId
						+ " The Shop Id Is :" + shopId + " The Date Is :" + invoiceDate
						+ " The Number Of Items Purshased : " + numberOfItems + " The Total Amount Is : " + totalAmount
						+ " The Amount Paid By The Customer : " + paidAmount + " The Remaining Amount " + balance
						+ " The Shop Contact Number :" + shopContactNumber + " The Shop Fax Number " + shopFaxNumber
						+ " The Shop Email Address : " + shopEmail + " The Shop Website Address : " + shopWebsite);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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