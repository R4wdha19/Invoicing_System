import java.util.Scanner;

public class Products {
	public static Scanner scanner = new Scanner(System.in);

	public static void productsDetails() {

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
					+ productName + "'," + " ' " + productPrice + "','" + productAvailableQuantity + "'" + ",'"
					+ productQuantityPrice + "'" + ") ";
			Constants.executingOfQurey(sqlQueryToInsert);

		}

	}
}
