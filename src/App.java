public class App {

	public static void main(String[] args) {
		// variable declaration - type, identifier, assignment operator, value, semicolon

		double asusPrice = 679.99;
		double dellPrice = 562.00;

		double moneyInWallet = 55.00;
		double moneyInAccount = 2000.00;

		int numberOfFriendsInTeaching = 38;
		int numberOfFriendsInProgramming = 4;

		int yearsInTeaching = 7;
		int yearsInProgramming = 1;

		int ageBeforeJune30th = 29;
		int ageAfterJune30th = 30;

		String myFirstName = "Bryce";
		String founderFirstName = "James";

		String myLastName = "Almstrum";
		String founderLastName = "Gosling";

		char myMiddleInitial = 'H';
		char founderMiddleInitial = 'A';

		double moneyInAccountAfterAsus = moneyInAccount - asusPrice;
		double moneyInAccountAfterDell = moneyInAccount - dellPrice;
		System.out.println("I will have $" + moneyInAccountAfterAsus + " left in checking if I buy the ASUS,");
		System.out.println("and $" + moneyInAccountAfterDell + " left if I buy the Dell instead.");

		int friendsPerYearTeaching = numberOfFriendsInTeaching / yearsInTeaching;
		int friendsPerYearProgramming = numberOfFriendsInProgramming / yearsInProgramming;
		System.out.println("I made " + friendsPerYearTeaching + " friends during an average year teaching,");
		System.out.println(
				"while I have made " + friendsPerYearProgramming + " so far during my first year programming.");

		String myFullName = myFirstName + ' ' + myMiddleInitial + ' ' + myLastName;
		System.out.println("My name is " + myFullName + ".");

	}

}
