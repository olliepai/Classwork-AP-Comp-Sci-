
public class Chapter6Exercise3 {
	public static void main(String[] args) {
		System.out.println(isTriangle(2, 3, 8));
	}
	
	public static boolean isTriangle(int side1, int side2, int side3) {
		int longestSide = 0;;
		int otherSides = 0;
		
		if (side1 > side2 && side1 > side3) {
			longestSide = side1;
			otherSides = side2 + side3;
		}
		else if (side2 > side1 && side2 > side3) {
			longestSide = side2;
			otherSides = side1 + side3;
		}
		else if (side3 > side1 && side3 > side2) {
			longestSide = side3;
			otherSides = side1 + side2;
		}
		
		if (longestSide > otherSides) {
			return false;
		}
		else {
			return true;
		}
		
	}
}
