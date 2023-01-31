import java.util.Scanner;

public class Shop {
	static Scanner scanner = new Scanner(System.in);

	public static void insertShopDetails() {

		System.out.println(" What Is The Name Of The Shop ? ");
		String shopName = scanner.next();
		System.out.println(" What Is The Location Of The Shop ? ");
		String shopLocation = scanner.next();
		System.out.println(" What Is The Shop Contact Number ? ");
		int shopContactNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Fax Number ?");
		int shopFax = scanner.nextInt();
		System.out.println(" What Is The Shop Email ? ");
		String shopEmail = scanner.next();
		System.out.println(" What Is The Shop Website ? ");
		String shopWebsite = scanner.next();

		String sqlQueryToInsert = "  INSERT INTO shop VALUES ( '" + shopName + "'," + " ' " + shopLocation + "',"
				+ shopContactNumber + "," + shopFax + ",'" + shopEmail + "','" + shopWebsite + "'" + ") ";
		Constants.executingOfUpdate(sqlQueryToInsert);

	}

	public static void UpdateInvoiceHeader() {
		System.out.println("What Is The Id Of The Shop To Be Updated ");
		int shopId = scanner.nextInt();
		System.out.println(" What Is The New Shop Contact Number ? ");
		int newShopContactNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Fax Number ?");
		int newShopFax = scanner.nextInt();
		System.out.println(" What Is The New Shop Email ? ");
		String newShopEmail = scanner.next();
		System.out.println(" What Is The New Shop Website ? ");
		String newShopWebsite = scanner.next();
		String sqlQueryToUpdate = " update shop SET shopContactNumber = " + newShopContactNumber + "," + newShopFax
				+ ",'" + newShopEmail + "','" + newShopWebsite + "'" + "where id = " + shopId;
		Constants.executingOfUpdate(sqlQueryToUpdate);

	}
}
