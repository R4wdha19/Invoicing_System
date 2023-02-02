import java.util.Scanner;

public class ReportsMenu {
	static Scanner scanner = new Scanner(System.in);

	// 4- Report: Statistics (No Of Items, No of Invoices, Total Sales)
	public static void reportsMenu() {
		System.out.println(" What Report You Would Like To See ? ");
		System.out.println(" 1 - The Shop Statistics ");
		System.out.println(" 2 - All The Invoices ");
		System.out.println(" 3 - All Shop Customers ");
		System.out.println(" 4 - All Shop Items");
		System.out.println(" 5 - Go Back To Main Menu ");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			Reports.reportOfShopStatistics();
			break;
		case 2:
			Reports.reportOfShopInvoices();
			break;
		case 3:
			Reports.reportOfShopCustomers();

			break;
		case 4:
			Reports.reportOfShopItems();
			break;
		case 5:
			Main.mainMenu();
			break;

		}

	}
}
