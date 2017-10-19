//Ollie Pai

import java.util.Scanner;

public class Names {
	
	public static void main(String[] args) {
		
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter your first name.");
		
		String firstName = keyboardListener.nextLine();
		
		System.out.println("Enter you last name.");
		
		String lastName = keyboardListener.nextLine();
		
		System.out.println("Hello " + firstName + " " + lastName);
		
	}
	
}
