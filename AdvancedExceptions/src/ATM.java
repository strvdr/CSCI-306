// Authors: Strydr Silverberg and Kale Carlson
//Purpose: ATM class

public class ATM {
	
	private BankAccount ba;
	
	ATM() {
		ba = new BankAccount(500);
	}
	
	// tries to withdraw 600 dollars with both functions in bankAccount
	private void handleTransactions() {
		try {
			ba.withdraw(600);
			
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			ba.quickWithdraw(600);
			
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String args[]) {
		ATM atm = new ATM();
		atm.handleTransactions();
	}
}
