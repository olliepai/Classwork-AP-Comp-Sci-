package rationalNumberClassDesignLab;

public class RationalNumberRunner {
	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(3, 9);
		RationalNumber r2 = new RationalNumber(-5);
		System.err.println(r1.divide(r2));
	}
}
