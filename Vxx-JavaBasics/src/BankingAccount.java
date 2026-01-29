
public class BankingAccount {
	protected double balance;
	private String owner;

	public void deposit(double amount) {
		double newBalance = balance + amount;
		// Better error handling covered soon!
		if (newBalance > 0)
			balance = newBalance;  
	}
	
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		// Better error handling covered soon!
		if (newBalance > 0)
			balance = newBalance;  
		else
			balance = 0;		
	}
	
	public BankingAccount(double balance, String owner) {
		super();
		this.balance = balance;
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "BankingAccount [balance=" + balance + ", owner=" + owner + "]";
	}

	public static void main(String[] args) {
		BankingAccount suzy = new BankingAccount(5000, "Suzy");
		suzy.deposit(500);
		suzy.withdraw(200);
		System.out.println(suzy);
	}
	
	public void monthlyUpdate() {
		
	}

}
