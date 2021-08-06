package exceptions;

import java.util.Scanner;

public class PaymentsApp {
	
	// Take a payment from a user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;

		do {
			// Ask the user for input
			System.out.print("Enter the payment amount: ");
			
			// Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePymt = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try againg");
				positivePymt = false;
			}
		} while(!positivePymt);
		
		// Print confirmation
		System.out.println("Thanks for your payment of €: " + payment);
	}
}
