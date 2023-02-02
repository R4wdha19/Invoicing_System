import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Reports {
	static Scanner scanner = new Scanner(System.in);

	public static void reportOfShopStatistics() {
		System.out.println(" What Is The Shop Id ? ");
		int invoiceIdFromInput = scanner.nextInt();
		String shopToPrintReport = "SELECT count(numberOfItems)As NumOfItems,count(InvoiceId) AS NumberOfInvoices,Sum(totalAmount)"
				+ "FROM Invoice where InvoiceId =" + invoiceIdFromInput;
		ResultSet results = Constants.executingOfQurey(shopToPrintReport);
		try {
			while (results.next()) {
				int invoiceId = results.getInt("InvoiceId");
				int numberOfItems = results.getInt("numberOfItems");
				int totalAmount = results.getInt("totalAmount");
				System.out.println(" The Invoice Id Is: " + invoiceId + " The Number Of Items Purshased : "
						+ numberOfItems + " The Total Amount Is : " + totalAmount);
				;
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
		try {
			while (results.next()) {
				int customerId = results.getInt("CustomerId");
				String customername = results.getString("customername");
				String customerphoneNumber = results.getString("customerphoneNumber");
				String customerPaymentMethod = results.getString("customerPaymentMethod");
				System.out.println(" The Customer Id Is :" + customerId + " The Customer Name Is :" + customername
						+ " The Customer phone Number Is :" + customerphoneNumber + " The Customer Payment Method : "
						+ customerPaymentMethod);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void reportOfShopItems() {
		String sqlQueryToPrintReport = "SELECT * FROM Items ";
		ResultSet results = Constants.executingOfQurey(sqlQueryToPrintReport);
		try {
			while (results.next()) {

				int itemId = results.getInt("itemId");
				int invoiceId = results.getInt("InvoiceId");
				String itemName = results.getString("itemName");
				int unitPrice = results.getInt("unitPrice");
				int quantity = results.getInt("quantity");
				int quantityAmount = results.getInt("quantityAmount");

				System.out.println(" The Item Id Is :" + itemId + "The Invoice Id Is: " + invoiceId
						+ " The Item Name Is :" + itemName + " The Unit Price Is :" + unitPrice + " The quantity Is :"
						+ quantity + " The Number Of Quantity Amount : " + quantityAmount);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}