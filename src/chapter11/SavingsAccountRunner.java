package chapter11;

public class SavingsAccountRunner {
	public static void main(String[] args) {
		SavingsAccount acct = new SavingsAccount("Mathilda", 3.99);
		
		acct.deposit(100);
		acct.withdraw(200.99);
		
		System.out.println(acct.getName());
		System.out.println(acct.getBalance());
	}
}
