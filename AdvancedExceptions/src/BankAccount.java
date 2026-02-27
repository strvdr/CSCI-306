// Authors: Strydr Silverberg and Kale Carlson
//Purpose: bank acount class

public class BankAccount {
	private double balance;
	
	//bank account constructor 
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	//withdraw function
	//@params double amountToWithdraw 
	//@throws NegativeBalanceException (with negative balance)
	
	public double withdraw(double amountToWithdraw) throws NegativeBalanceException {
		double tempBalance = balance - amountToWithdraw;
		if(tempBalance < 0) {
			throw new NegativeBalanceException(tempBalance);
		} else {
			this.balance = tempBalance;
		}

		return balance;
	}
	
	//quickwithdraw function
	//@params double amountToWithdraw 
	//@throws NegativeBalanceException (without negative balance)

	public double quickWithdraw(double amountToWithdraw) throws NegativeBalanceException {
		if(amountToWithdraw > balance) {
			throw new NegativeBalanceException();
		} else {
			this.balance = balance - amountToWithdraw;
		}

		return balance;
	}
	
}
