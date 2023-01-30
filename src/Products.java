import java.util.Scanner;

public class Products {
	public static void productsDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" What Is The Product Name ?");
		String productName = scanner.next();
		System.out.println(" What Is The Product Price ?");
		int productPrice = scanner.nextInt();
		System.out.println(" What Is The Proudct Available Quantity ?");
		int productAvailableQuantity = scanner.nextInt();
		System.out.println(" What Is The Quantity Price ?");
		int productQuantityPrice = scanner.nextInt();
	}

}
