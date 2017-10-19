import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner converter = new Scanner(System.in);
		
		//give them directions
		System.out.println("Enter degrees Celsius");
		
		//gather the degrees celsius
		double degC = converter.nextDouble();
		
		//calculate the farenheit and report answer
		double degF = 1.8 * degC + 32;
		System.out.println(degF);
	}	
}
