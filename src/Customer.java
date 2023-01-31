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
}
