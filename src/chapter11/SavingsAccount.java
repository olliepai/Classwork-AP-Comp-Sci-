package chapter11;

public class SavingsAccount {
	private double balance;
	private String name;
	
	public SavingsAccount(String n) {
		balance = 0.0;
		name = n;
	}
	
	public SavingsAccount(String n, double b) {
		balance = b;
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {	
		if (amt <= 0) {
			throw new IllegalArgumentException();
		}
		
		balance += amt;
	}
	
	public void withdraw(double amt) {
		if (amt <= 0 || amt > balance) {
			throw new IllegalArgumentException();
		}
		
		balance -= amt;
	}
}
