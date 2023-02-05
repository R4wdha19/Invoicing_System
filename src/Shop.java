import java.util.Scanner;

public class Shop {
	static Scanner scanner = new Scanner(System.in);

	public static void insertHeaderDetails() {
		System.out.println(" What Is The Shop Contact Number ? ");
		int ShopContactNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Fax Number ?");
		int ShopFax = scanner.nextInt();
		System.out.println(" What Is The  Shop Email ? ");
		String ShopEmail = scanner.next();
		System.out.println(" What Is The  Shop Website ? ");
		String ShopWebsite = scanner.next();
		String sqlQueryToUpdate = "  INSERT INTO Hearder (shopContactNumber,shopFaxNumber,shopEmail,shopWebsite)"
				+ ShopContactNumber + "," + ShopFax + ",'" + ShopEmail + "','" + ShopWebsite + "'" + ") ";
		Constants.executingOfUpdate(sqlQueryToUpdate);

	}

	public static void insertShopDetails() {
		System.out.println(" What Is The Header Id ? ");
		int headerId = scanner.nextInt();
		System.out.println(" What Is The Name Of The Shop ? ");
		String shopName = scanner.next();
		System.out.println(" What Is The Location Of The Shop ? ");
		String shopLocation = scanner.next();
		String sqlQueryToInsert = "  INSERT INTO shop (headerId,shopName,shopLocation)VALUES ( " + headerId + ",'"
				+ shopName + " ',' " + shopLocation + "'" + ") ";
		Constants.executingOfUpdate(sqlQueryToInsert);

	}

	public static void UpdateInvoiceHeader() {
		System.out.println("What Is The Id Of The Shop To Be Updated ");
		int shopId = scanner.nextInt();
		System.out.println(" What Is The New Shop Contact Number ? ");
		int newShopContactNumber = scanner.nextInt();
		System.out.println(" What Is The New Shop Fax Number ?");
		int newShopFax = scanner.nextInt();
		System.out.println(" What Is The New Shop Email ? ");
		String newShopEmail = scanner.next();
		System.out.println(" What Is The New Shop Website ? ");
		String newShopWebsite = scanner.next();
		String sqlQueryToUpdate = " update Hearder SET shopContactNumber = " + newShopContactNumber + "," + newShopFax
				+ ",'" + newShopEmail + "','" + newShopWebsite + "'" + "where id = " + shopId;
		Constants.executingOfUpdate(sqlQueryToUpdate);

	}
}
