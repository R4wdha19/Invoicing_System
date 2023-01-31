import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Invocies {
	static Scanner scanner = new Scanner(System.in);

	public static void insertInvoiceDetails() {

		System.out.println(" What Is The Customer Id ? ");
		int CustomerId = scanner.nextInt();
		System.out.println(" What Is The Date Of The Invoice  ? ");
		String invoiceDate = scanner.next();
		System.out.println(" What Is The number Of Items? ");
		int numberOfItems = scanner.nextInt();
		System.out.println(" What Is The Total Amount ?");
		int totalAmount = scanner.nextInt();
		System.out.println(" What Is The paid Amount ? ");
		int paidAmount = scanner.nextInt();
		System.out.println(" What Is The balance ? ");
		int balance = scanner.nextInt();
		System.out.println(" What Is The Shop Contact Number ?");
		int shopContactNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Fax Number ? ");
		int shopFaxNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Email ? ");
		String shopEmail = scanner.next();
		System.out.println(" What Is The Shop Website ? ");
		String shopWebsite = scanner.next();

		String sqlQueryToInsert = "  INSERT INTO Invoice VALUES ( " + CustomerId + "," + " ' " + invoiceDate + "',"
				+ numberOfItems + "," + totalAmount + "," + paidAmount + "," + balance + "," + shopContactNumber + ","
				+ shopFaxNumber + ",'" + shopEmail + "','" + shopWebsite + "'" + ") ";
		Constants.executingOfQurey(sqlQueryToInsert);
	}

	public static void searchInvoice() {
		System.out.println(" What Is The Invoice Id ? ");
		int InvoiceId = scanner.nextInt();
		String sqlQueryToSearch = "SELECT * FROM Invoice where InvoiceId =" + InvoiceId;
		Constants.executingOfQurey(sqlQueryToSearch);
		ResultSet results = Constants.executingOfQurey(sqlQueryToSearch);
		try {
			while (results.next()) {
				int invoiceId = results.getInt("InvoiceId");
				int customerId = results.getInt("CustomerId");
				String invoiceDate = results.getString("invoiceDate");
				int numberOfItems = results.getInt("numberOfItems");
				int totalAmount = results.getInt("totalAmount");
				int paidAmount = results.getInt("paidAmount");
				int balance = results.getInt("balance");
				int shopContactNumber = results.getInt("shopContactNumber");
				int shopFaxNumber = results.getInt("shopFaxNumber");
				String shopEmail = results.getString("shopEmail");
				String shopWebsite = results.getString("shopWebsite");
				System.out.println(invoiceId + " " + customerId + " " + invoiceDate + " " + numberOfItems + " "
						+ totalAmount + " " + paidAmount + " " + balance + " " + shopContactNumber + " " + shopFaxNumber
						+ " " + shopEmail + " " + shopWebsite);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
