import java.util.Scanner;

public class TempConverter {
	
	public static void main(String[] args) {

		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter an \"F\" if you have a temperature in Farenheit or \"C\" if you have a temperature in Celsius.");
		
		String type = keyboardListener.nextLine();
		
		System.out.println("Enter the number you would like to convert.");
		
		double num = keyboardListener.nextDouble();
		
		keyboardListener.nextLine();
		
		if (type.equals("F")) {
			convertFtoC(num);
		}
		else if (type.equals("C")) {
			convertCtoF(num);
		}
		else {
			System.out.println("You did not correctly enter a \"C\" or an \"F\" for the first input.");
		}
		
	}
	
	public static void convertCtoF(double tempC) {
		
		double tempF = 1.8 * tempC + 32;
		
		System.out.println(tempC + " C equals " + tempF + " F");
		
	}
	
	public static void convertFtoC(double tempF) {
		
		double tempC = 5.0/9 * (tempF - 32);
		
		System.out.println(tempF + " F equals " + tempC + " C");
		
	}
	
}
