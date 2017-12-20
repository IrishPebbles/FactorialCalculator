package factorialCalculator;

import java.util.Scanner;

public class FactorialCalculator {

	private int userNum;
	// use long type to store factorial
	private long factorialNum = 1;
	// private String continueReply = "Y";

	public void Calculator() {
		Scanner sc = new Scanner(System.in);

		do {
			// prompt the user to enter a number between 1 and 10
			userNum = Validator.getInt(sc, "Enter a number between 1 and 10:\n", 1, 10);

			// display the factorial of the number entered
			// use for loop for calculation
			for (int i = 1; i <= userNum; i++) {
				factorialNum *= i;
			}

			System.out.println("The factorial of " + userNum + " is " + factorialNum + ".\n");

		} while (Validator.getYorN(sc, "Would you like to continue? (y/n)"));
		
		System.out.println("Thank you for using \"Factorial Calculator\"!");

		sc.close();
	}

}
