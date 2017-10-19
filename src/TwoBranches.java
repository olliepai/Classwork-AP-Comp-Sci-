import java.util.Scanner;

public class TwoBranches {
	
	public static void main(String[] args) {
		
		Scanner keyboardListener = new Scanner(System.in);
		
		System.out.println("Enter 1 or 2 as an integer.");
		
		int num = keyboardListener.nextInt();
		
		keyboardListener.nextLine();
		
		if (num == 1) {
			
			branchOne();
			
		}
		
		else if (num == 2) {
			
			branchTwo();
			
		}
		else {
			
			System.out.println("Follow directions next time...enter a 1 or a 2.");
		
		}
	
	}
	
	public static void branchOne() {
	
		System.out.println("branch one");
	
	}
	
	public static void branchTwo() {
	
		System.out.println("branch two");

	}
	
}
