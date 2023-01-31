import java.util.Scanner;

public class Products {
	public static Scanner scanner = new Scanner(System.in);

	public static void insertProductsDetails() {

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
					+ productName + "'," + productPrice + "," + productAvailableQuantity + "," + productQuantityPrice
					+ ") ";
			Constants.executingOfQurey(sqlQueryToInsert);

		}

	}

	public static void deleteProduct() {
		System.out.println(" Please Provide Us With The Name Of The Product That Is Out " + " Of Stock ! ");
		String productName = scanner.next();
		String sqlQueryToDelete = "  delete from Items where itemName = '" + productName + "'";
		Constants.executingOfUpdate(sqlQueryToDelete);
		System.out.println(" ");

	}

	public static void updateProductPrice() {
		System.out.println(" Please Provide Us With The Name Of The Product That Is On Discount !! ");
		String productName = scanner.next();
		System.out.println(" YAY !! What Is The New Price? ");
		int productPrice = scanner.nextInt();
		String sqlQueryToUpdate = "  Update Items SET unitPrice =" + productPrice + " where itemName = '" + productName
				+ "'";
		Constants.executingOfUpdate(sqlQueryToUpdate);

	}

}
