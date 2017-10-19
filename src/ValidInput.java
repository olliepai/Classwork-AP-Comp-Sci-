import java.util.Scanner;

public class ValidInput {
	
	public static void main(String[] args) {
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter a non-negative integer.");
		
		int num = keyboardListener.nextInt();
		
		keyboardListener.nextLine();
		
		testInput(num);
		
	}
	
	public static void testInput(int input) {
		
		if (input < 0) {
			
			System.out.println("Error: negative inputs not allowed");
			
			return;
			
		}
		
		System.out.println("You entered " + input);
		
	}
	
}
