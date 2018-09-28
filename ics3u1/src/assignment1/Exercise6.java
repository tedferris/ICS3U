package assignment1;

import java.util.Scanner;
import java.math.*;

public class Exercise6 {
	
	public static void main (String[] args) {
		//Declares 'input' as the name of the scanner
		Scanner input = new Scanner(System.in);  
		//Outputs a prompt requesting an input
		System.out.print("Enter the change in cents: ");
		//Declares 'change' as the number the user entered.
		int change = input.nextInt();
		//Blank line for formatting
		System.out.println("");
		//Title for following text.
		System.out.println("The minimum number of coins is:");
		//Outputs the number of quarters as the change divided by 25
		System.out.println("	Quarters: " + (change / 25));
		//Defines dimes as the remainder of change divided by 25
		int dimes = change % 25;
		//Outputs the number of dimes as the change leftrect over from quarters divided by 10
		System.out.println("	Dimes: " + (dimes / 10));
		//Defines nickels as the remainder of change divided by 25, then 10
		int nickels = dimes % 10;
		//Outputs the number of dimes as the change leftrect over from quarters and dimes divided by 5
		System.out.println("	Nickels: " + (nickels / 5));
		//Defines nickels as the remainder of change divided by 25, then 10, then 5
		int pennies = nickels % 5;
		//Outputs the number of dimes as the change leftrect over from quarters, dimes and nickels
		System.out.println("	Pennies: " + (pennies));
	}

}