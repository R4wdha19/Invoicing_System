import java.util.Scanner;

public class ShopSettings {
	static Scanner scanner = new Scanner(System.in);

	public static void shopSettingsMenu() {
		System.out.println("Here Are The Settings Of Our System, Please Choose What You Want To Do :");
		System.out.println(" 1 - Add A New Shop ");
		System.out.println(" 2 - Load The Shop Data ");
		System.out.println(" 3 - Set The Invoice Header ");
		System.out.println(" 4 - Go Back To The Main Menu");

		int input = scanner.nextInt();
		switch (input) {
		case 1:

			break;
		case 2:
			Shop.insertShopDetails();
			break;
		case 3:

			break;
		case 4:
			Products.insertProductsDetails();
			break;
		case 5:
		case 6:
		case 7:
		}
	}

}
