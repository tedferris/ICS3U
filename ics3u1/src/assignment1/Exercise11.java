package assignment1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		//Declares 'input' as the name of the scanner
		Scanner input = new Scanner(System.in);
		//Requests the user to declare the number of burgers.
		System.out.print("Enter the number of burgers: ");
		//Declares 'burgers' as the input from above
		int burgers = input.nextInt();
		//Requests the user to declare the number of fries.
		System.out.print("Enter the number of fries: ");
		//Declares 'fries' as the input from above
		int fries = input.nextInt();
		//Requests the user to declare the number of sodas.
		System.out.print("Enter the number of sodas: ");
		//Declares 'sodas' as the input from above.
		int sodas = input.nextInt();
		//Adds up the total cost from above and multiplies it by the according price.
		//It then multiples the number by 100, rounds it to a whole number, and then dividing by 100.
		double total = Math.round(((burgers * 1.69) + (fries * 1.09) + (sodas * 0.99)) * 100.0) / 100.0;
		//Outputs the total from above, with proper formatting.
		System.out.println("Total before tax: $" + total);
		//Declares 'tax' as 6.5% of the total, rounded to 2 digits using the same technique as above.
		double tax = Math.round(total * 0.065 * 100.0 ) / 100.0;
		//Outputs the 'tax' value as above, formatted properly again.
		System.out.println("Tax: $" + tax);
		//Declares 'finalTotal' as the total plus the taxes, again rounded to 2 digits.
		double finalTotal = Math.round((total + tax) * 100.0) / 100.0;
		//Outputs the 'finalTotal' from above, formatted properly.
		System.out.println("Final total: $" + (finalTotal));
		//Outputs a prompt requesting the user for the amount of change given.
		System.out.print("Enter cash tendered: $");
		//Declares 'cash' as the amount of cash given.
		double cash = input.nextDouble();
		//Declares 'tendered' as the amount of cash given, rounded to 2 decimal places.
		double tendered = Math.round(cash * 100.0) / 100.0;
		//Declares 'change' as the amount of money given minus the total from above, with tax.
		double change = (tendered - finalTotal);
		//Rounds 'change' from above to 2 decimal places and stores it in a new double.
		double finalChange = Math.round(change * 100.0) / 100.0; 
		//Outputs 'finalChange' with proper formatting.
		System.out.println("Change: $" + finalChange);
	}
}