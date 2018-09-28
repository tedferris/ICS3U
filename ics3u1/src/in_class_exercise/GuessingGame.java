package in_class_exercise;

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	System.out.print("Please Enter an Integer: ");
	
	int number = input.nextInt();
	
	double secretnumber = 0.1;
	
	while(number != secretnumber) {
		
		System.out.print("Please Enter an Integer: ");
		
		number = input.nextInt();
		}
	System.out.println("You Got The Number!");
	}
}