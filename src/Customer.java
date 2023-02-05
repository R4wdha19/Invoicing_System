import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
	static Scanner scanner = new Scanner(System.in);

	public static void insertCustomerDetails() {
		System.out.println(" Lets Add A New Customer \n");
		System.out.println(" What Is The Name Of The Customer ? ");
		String customerName = scanner.next();
		System.out.println(" What Is The Customer Contact Number ? ");
		int customerContactNumber = scanner.nextInt();
		System.out.println(" What Is The Customer Payment Method? ");
		String customerPaymentMethod = scanner.next();

		String sqlQueryToInsert = "INSERT INTO Customers VALUES ( '" + customerName + "'," + customerContactNumber
				+ ",'" + customerPaymentMethod + "'" + ") ";
		Constants.executingOfUpdate(sqlQueryToInsert);

	}

	public static Map<String, Integer> numberOfTimesAMainMenuOptionWasChosen() {
		Map<String, Integer> numberOfClicks = new HashMap<String, Integer>();
		numberOfClicks.put("Start By Establishing A DataBase Connection To Load Your Data", 0);
		numberOfClicks.put("Shop Settings", 0);
		numberOfClicks.put("Shop Management", 0);
		numberOfClicks.put("Create A New Invoice", 0);
		numberOfClicks.put("Get Reports", 0);
		numberOfClicks.put("Search An Invoice", 0);
		numberOfClicks.put("Program Statistics", 0);
		numberOfClicks.put("Exit", 0);
		return numberOfClicks;

	}
}
