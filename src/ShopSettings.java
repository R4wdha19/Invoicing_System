import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopSettings {
	static Scanner scanner = new Scanner(System.in);

	public static void shopSettingsMenu() {
		try {
			System.out.println("Here Are The Settings Of Our System, Please Choose What You Want To Do :");
			System.out.println(" 1 - Add A New Shop ");
			System.out.println(" 2 - Load The Shop Data ");
			System.out.println(" 3 - Add A New Shop Header ");
			System.out.println(" 4 - Set The Invoice Header ");
			System.out.println(" 5 - Go Back To The Main Menu");

			int input = scanner.nextInt();
			switch (input) {
			case 1:
				Shop.insertShopDetails();
				break;
			case 2:
				System.out.println(" What Would You Like To Load ?" + "If You Want To Add An Item Press 1"
						+ "If You Want To Add A New Invoice Press 2" + "Or If You No Longer Want To Add Press 0");
				int loadingInput = scanner.nextInt();
				if (loadingInput == 1) {
					Products.insertProductsDetails();
				} else if (loadingInput == 2) {

				} else {
					ShopSettings.shopSettingsMenu();
				}

				break;
			case 3:
				Shop.insertHeaderDetails();
				break;
			case 4:
				Shop.UpdateInvoiceHeader();
				break;
			case 5:
				Main.mainMenu();
				break;

			}
		} catch (InputMismatchException e) {
			System.out.println(
					" Oops ! You Have Entered The Wrong Input ! Try Again ! This Time Use Numbers Provided In The Menu !");

		}
	}

}
