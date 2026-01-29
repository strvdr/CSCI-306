package files_exceptions;

import java.util.Scanner;

public class ATM {
	private double balance; 

	public ATM(double maxCash) {
		super();
		this.balance = maxCash;
	}
	
	public double withdrawal () throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter cash amount: ");
		double cash = scan.nextDouble();
		if (cash > balance)
			throw new Exception("Amount requested " + cash + " exceeds available (" + balance + ")");
		
		return cash;
	}
	
	public void deductWithdrawal(double amount) {
		balance -= amount;
	}
	

}
