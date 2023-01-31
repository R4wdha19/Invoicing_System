import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean mainMenu = true;
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
				Invocies.insertInvoiceDetails();
				break;
			case 4:
				Reports.reportsMenu();
				break;
			case 5:
				Invocies.searchInvoice();
				break;

			case 6:
				break;

			case 7:
				break;
			}
		}
	}
}