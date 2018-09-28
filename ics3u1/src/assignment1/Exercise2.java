package assignment1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main (String args[]) {
		//Declares 'input' as the name of the scanner
		Scanner input = new Scanner(System.in); //Declares 'input' as a scanner
		//Outputs a prompt requesting input
		System.out.println("Enter the diameter of the pizza in inches:"); 
		//Declares 'dmtr' as the input from above.
		int dmtr = input.nextInt(); 
		//Calculates the final cost of the pizza and outputs it
		System.out.println("The cost of making the pizza is: $" + ((.05 * dmtr * dmtr) + 1.00 + 0.75)); 
		
	}
}
