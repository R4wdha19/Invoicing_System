import java.util.Scanner;

public class Shop {
	public static void insertShopDetails() {
		Scanner scanner = new Scanner(System.in);
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

//		executing/.
//		
//		
//		
//		
//		ResultSet rs = Constants.executingOfQurey(sqlQueryToInsert);
//		try {
//			System.out.print(" A New Shop Has Been Added These Are The Details Of It :" + rs.getString(shopName));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
