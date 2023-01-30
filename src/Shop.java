import java.util.Scanner;

public class Shop {
	public static void shopDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Whate Is The Name Of The Shop ? ");
		String shopName = scanner.next();
		System.out.println(" Whate Is The Location Of The Shop ? ");
		String shopLocation = scanner.next();
		System.out.println(" Whate Is The Shop Contact Number ? ");
		int shopContactNumber = scanner.nextInt();
		System.out.println(" What Is The Shop Fax Number ?");
		int shopFax = scanner.nextInt();
		System.out.println(" Whate Is The Shop Email ? ");
		String shopEmail = scanner.next();
		System.out.println(" Whate Is The Shop Website ? ");
		String shopWebsite = scanner.next();

		String sqlQueryToInsert = "  INSERT INTO shop VALUES ( '" + shopName + "'," + " ' " + shopLocation + "',"
				+ shopContactNumber + "," + shopFax + ",'" + shopEmail + "','" + shopWebsite + "'" + ") ";
		Constants.executingOfQurey(sqlQueryToInsert);

	}

}
