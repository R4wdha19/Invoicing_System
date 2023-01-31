import java.util.Scanner;

public class ShopItemManagement {
	public static Scanner scanner = new Scanner(System.in);

	public static void manageShopMenu() {
		System.out.println("What Would Like To Manage ?");
		System.out.println("1 - Add An Item ");
		System.out.println("2 - Delete An Item ");
		System.out.println("3 - Change The Price Of An Item");
		System.out.println("4 - Go Back To Main Menu ");

		int input = scanner.nextInt();
		switch (input) {
		case 1:
			Products.insertProductsDetails();
			break;
		case 2:
			Products.deleteProduct();
			break;
		case 3:
			Products.updateProductPrice();
			break;
		case 4:
//Still working on it 
			break;

		}
	}
}