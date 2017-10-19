import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner keyboardListener = new Scanner(System.in);
		
		//give the user directions
		System.out.println("Enter your name, please");
		
		//gather the input from the Scanner object
		String name = keyboardListener.nextLine();
		
		//do something with that information
		System.out.println("Hello, " + name);
	}
}
