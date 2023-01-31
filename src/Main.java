import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static boolean mainMenu = true;

	public static void main(String[] args) {

		Main.mainMenu();
	}

	public static void mainMenu() {
		while (mainMenu) {
			System.out.println(" Welcome To Our Invoicing System, These Are The Services That Our System Provide:");
			System.out.println(" 0 - Start By Establishing A DataBase Connection To Load Your Data ");
			System.out.println(" 1 - Shop Settings");
			System.out.println(" 2 - Shop Management ");
			System.out.println(" 3 - Create A New Invoice ");
			System.out.println(" 4 - Get Reports ");
			System.out.println(" 5 - Search An Invoice ");
			System.out.println(" 6 - Program Statistics ");
			System.out.println(" 7 - Exit ");

			int input = scanner.nextInt();
			switch (input) {
			case 0:
				Constants.establishADataBaseConnection();
				break;
			case 1:
				ShopSettings.shopSettingsMenu();
				break;
			case 2:
				ShopItemManagement.manageShopMenu();
				break;
			case 3:
				System.out
						.println(" Are You Creating An Invoice For A New Customer ?" + "If Yes Press 1 If No Press 2 ");
				int userInput = scanner.nextInt();
				if (userInput == 1) {
					Customer.insertCustomerDetails();
				}
				Invocies.insertInvoiceDetails();

				break;
			case 4:
				Reports.reportsMenu();
				break;
			case 5:
				Invocies.searchInvoice();
				break;
			case 6:
				System.out.println("Still Working On It SORRY !!  ");
				break;

			case 7:
				System.exit(0);
				break;
			}
		}
	}
}
