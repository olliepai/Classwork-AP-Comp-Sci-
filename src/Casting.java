//Ollie Pai

import java.util.Scanner;

public class Casting {
	
	public static void main(String[] args) {
		
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter a decimal number.");
		
		double decNum = keyboardListener.nextDouble();
		
		keyboardListener.nextLine();
		
		int truncNum = (int) decNum;
		
		int roundNum = (int) (decNum + 0.5);
		
		System.out.println("You entered: " + decNum + "\nTruncated integer: " + truncNum + "\nRounded integer: " + roundNum);
	
	}
	
}
