import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static boolean mainMenu = true;

	public static void main(String[] args) {

		Constants.showMenu(1);
	}

	public static void mainMenu() {
		Map<String, Integer> programStatistics = Customer.numberOfTimesAMainMenuOptionWasChosen();
		try {
			while (mainMenu) {
//				System.out.println(" Welcome To Our Invoicing System, These Are The Services That Our System Provide:");
//				System.out.println(" 0 - Start By Establishing A DataBase Connection To Load Your Data ");
//				System.out.println(" 1 - Shop Settings");
//				System.out.println(" 2 - Shop Management ");
//				System.out.println(" 3 - Create A New Invoice ");
//				System.out.println(" 4 - Get Reports ");
//				System.out.println(" 5 - Search An Invoice ");
//				System.out.println(" 6 - Program Statistics ");
//				System.out.println(" 7 - Exit ");

				int input = scanner.nextInt();
				switch (input) {
				case 0:
					programStatistics.put("Start By Establishing A DataBase Connection To Load Your Data",
							programStatistics.get("Start By Establishing A DataBase Connection To Load Your Data") + 1);
					System.out.println(
							" Are You Establishing The Connection For The first time ? If Yes Press 1 If No Press 2  ");
					int connectingToDBUserInput = scanner.nextInt();
					if (connectingToDBUserInput == 1) {
						Constants.establishADataBaseConnection();
						System.out.println("Do You Want To Create An Empty Tables ? Or Tables With Default Values ? "
								+ "If You Want To Have Tables With Default Values Press 1"
								+ "If Not Press Any Other Number");
						int UserInputToCreateTable = scanner.nextInt();
						if (UserInputToCreateTable == 1) {
							CreatingTables.settingDefaultValues();
						} else {
							CreatingTables.creatingEmptyTable();
						}

					} else {
						Constants.establishADataBaseConnection();
					}
					break;
				case 1:
					programStatistics.put("Shop Settings", programStatistics.get("Shop Settings") + 1);
					// ShopSettings.shopSettingsMenu();
					Constants.showMenu(2);
					break;
				case 2:
					programStatistics.put("Shop Management", programStatistics.get("Shop Management") + 1);
//					ShopItemManagement.manageShopMenu();
					Constants.showMenu(3);
					break;
				case 3:
					programStatistics.put("Create A New Invoice", programStatistics.get("Create A New Invoice") + 1);
					System.out.println(
							" Are You Creating An Invoice For A New Customer ?" + "If Yes Press 1 If No Press 2 ");
					int userInput = scanner.nextInt();
					if (userInput == 1) {
						Customer.insertCustomerDetails();
					}
					Invocies.insertInvoiceDetails();
					break;
				case 4:
					programStatistics.put("Get Reports", programStatistics.get("Get Reports") + 1);
					// ReportsMenu.reportsMenu();
					Constants.showMenu(3);
					break;
				case 5:
					programStatistics.put("Search An Invoice", programStatistics.get("Search An Invoice") + 1);
					Invocies.searchInvoice();
					break;
				case 6:
					programStatistics.put("Program Statistics", programStatistics.get("Program Statistics") + 1);
					for (Map.Entry<String, Integer> x : programStatistics.entrySet()) {
						System.out.println(x.getKey() + x.getValue());
					}

					break;

				case 7:
					programStatistics.put("Exit", programStatistics.get("Exit") + 1);
					System.exit(0);
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(
					" Oops ! You Have Entered The Wrong Input ! Try Again ! This Time Use Numbers Provided In The Menu !");

		}
	}
}
