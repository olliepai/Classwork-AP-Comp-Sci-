package rationalNumberClassDesignLab;

public class RationalNumber {
	//two private instance variables to represent the numerator and denominator
	private int num, den;
	
	//a two parameter constructor that sets the numerator and denominator
	public RationalNumber(int n, int d) {
		if (d == 0) {
			throw new IllegalArgumentException("You can't divide by 0!!");
		}
		num = n;
		den = d;
	}
	
	//A one parameter constructor that is used to create a fraction to represent an integer.
	//The denominator should be set to 1.
	public RationalNumber(int n) {
		num = n;
		den = 1;
	}
	
	//A copy constructor which takes another RationNumber object and creates a new one with the
	//same numerator and denominator.
	public RationalNumber(RationalNumber other) {
		num = other.getNumerator();
		den = other.getDenominator();
	}
	
	//two accessor methods...getters that should just return the appropriate data values
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	//This method divides out all common factors of the numerator and denominator so
	//that if numerator is 12 and denominator is 30, at the end of this method num is 2 and den is 5
	public void reduce() {
		int maxGCF;
		int GCF = 1;
		
		if (num > den) {
			maxGCF = den;
		} else {
			maxGCF = num;
		}
		
		for (int posGCF = 1; posGCF <= maxGCF; posGCF++) {
			if (num % posGCF == 0 && den % posGCF == 0) {
				GCF = posGCF;
			}
		}
		
		num /= GCF;
		den /= GCF;
	}
	
	//the method adds this fraction to the other fraction and return the result in a new RationalNumber
	//object. Note: neither this fraction nor the other fraction should be modified in this process.
	public RationalNumber add (RationalNumber other) {
		int newNum = this.num * other.den + other.num * this.den;
		
		int newDen = this.den * other.den;
		
		return new RationalNumber(newNum, newDen);
	}
	
	//The method subtracts the other fraction from this one. The result is returned in a new 
	//RationalNumber object. Note: neither this fraction nor the other should be modified.
	public RationalNumber subtract(RationalNumber other ) {
		int newNum = this.num * other.den - other.num * this.den;
		
		int newDen = this.den * other.den;
		
		return new RationalNumber(newNum, newDen);
	}
	
	//the method multiplies this fraction to the other and returns the result in a new RationalNumber.
	//Note: neither this fraction nor the other fraction should be modified in this process.
	public RationalNumber multiply(RationalNumber other ) {
		int newNum = this.num * other.num;
		
		int newDen = this.den * other.den;
		
		return new RationalNumber(newNum, newDen);
	}
	
	//the method calculates this fraction divided by other fraction and returns the result in a new 
	//RationalNumber object. Note: neither this fraction nor the other should be modified.
	public RationalNumber divide(RationalNumber other ) {
		int newNum = this.num * other.den;
		
		int newDen = this.den * other.num;
		
		return new RationalNumber(newNum, newDen);
	}
	
	//the method returns the reciprocal of this fraction as a new RationalNumber.
	//Note: this fraction object should not be modified in this process.
	public RationalNumber reciprocal() {
		return new RationalNumber(this.den, this.num);
	}
	
	//the method calculates the opposite of this fraction and returns the result in a new RationalNumber.
	//Note: this fraction object should not be modified in this process.
	public RationalNumber opposite() {
		return new RationalNumber(num * -1, den);
	}
	
	//This should return a decimal representation of the fraction (as a double)
	public double toDecimal() {
		return (double) num / den;
	}
	
	//Override the toString() method to return a String in the format “numerator/denominator”
	public String toString() {
		if (den != 1) {
			return num + "/" + den;
		} else {
			return num + "";
		}
	}
	
	//Override the equals method inherited from Object
	public boolean equals( RationalNumber other ) {
		if (this.num * other.den == this.den * other.num) {
			return true;
		} else {
			return false;
		}
	}

}
