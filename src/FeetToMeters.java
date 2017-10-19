//Ollie Pai3.7

import java.util.Scanner;

public class FeetToMeters {
	
	public static void main(String[] args) {
		
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter a decimal number of feet.");
		
		double feet = keyboardListener.nextDouble();
		
		keyboardListener.nextLine();
		
		double meters = feet * 0.3048;
		
		System.out.println(feet + " feet is equal to " + meters + " meters");
		
	}
	
}
