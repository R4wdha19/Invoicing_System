import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Invocies {
	static Scanner scanner = new Scanner(System.in);

	public static void insertInvoiceDetails() {
		System.out.println(" What Is The Customer Id ? ");
		int CustomerId = scanner.nextInt();
		System.out.println(" What Is The Shop Id ? ");
		int shopId = scanner.nextInt();
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

		String sqlQueryToInsert = "  INSERT INTO Invoice(CustomerId,shopId, invoiceDate, numberOfItems,"
				+ "totalAmount ,paidAmount ,balance ,shopContactNumber,shopFaxNumber ,shopEmail,"
				+ "shopWebsite )VALUES ( " + CustomerId + "," + shopId + ",'" + invoiceDate + "'," + numberOfItems + ","
				+ totalAmount + "," + paidAmount + "," + balance + "," + shopContactNumber + "," + shopFaxNumber + ",'"
				+ shopEmail + "','" + shopWebsite + "'" + ") ";

		System.out.println(sqlQueryToInsert);
		Constants.executingOfUpdate(sqlQueryToInsert);
	}

	public static void searchInvoice() {
		System.out.println(" What Is The Invoice Id ? ");
		int invoiceIdInput = scanner.nextInt();
		String sqlQueryToSearch = "SELECT * FROM Invoice where InvoiceId =" + invoiceIdInput;

		ResultSet results = Constants.executingOfQurey(sqlQueryToSearch);
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
}
