//Ollie Pai4

import java.util.Scanner;

public class SomeDivision {
	
	public static void main(String[] args) {
		
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter an integer for the numerator.");
		
		int numerator = keyboardListener.nextInt();
		
		keyboardListener.nextLine();
		
		System.out.println("Enter an integer for the denominator.");
		
		int denominator = keyboardListener.nextInt();
		
		int quotient = numerator / denominator;
		
		int remainder = numerator % denominator;
		
		System.out.println(numerator + " divided by " + denominator + " is " + quotient + " with a remainder of " + remainder);
	
	}
	
}
