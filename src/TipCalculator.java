import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		
		//tell the user what to enter
		System.out.println("Enter the total of the bill.");	
		
		//gather the input from the user through the Scanner object
		double bill = calculator.nextDouble();
		//calculator.nextLine();
		
		//do something with that information
		final double TIP_RATE = 0.15;
		double tip = TIP_RATE * bill;
		System.out.println("The tip for a $" + bill + " bill will be $" + tip);
	}
}
