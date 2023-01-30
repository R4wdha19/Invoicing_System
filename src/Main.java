import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Welcome To Our Invoicing System, These Are The Services That Our System Provide:");
		System.out.println(" 1 - Shop Settings");
		System.out.println(" 2 - Shop Management ");
		System.out.println(" 3 - Create A New Invoice ");
		System.out.println(" 4 - Get Reports ");
		System.out.println(" 5 - Search An Invoice ");
		System.out.println(" 6 - Program Statistics ");
		System.out.println(" 7 - Exit ");

		int input = scanner.nextInt();
		switch (input) {
		case 1:
			ShopSettings.shopSettingsMenu();
		case 2:
			ShopItemManagement.manageShopMenu();
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		}
	}
}