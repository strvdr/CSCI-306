
public class Bank {
	public final static int MAX_ACCOUNTS = 100;

	public static void main(String[] args) {
		BankingAccount [] accounts = new BankingAccount[MAX_ACCOUNTS];
		accounts[0] = new BankingAccount(2500, "Sally");
		accounts[1] = new SavingsAccount(7500, "Morgan", 0.02);
		System.out.println("List of accounts");
		for (int i=0; i<2; i++)
			System.out.println(accounts[i]);		
		BankingAccount banking = new SavingsAccount(3000, "Tim", 0.01);
		//SavingsAccount savings = new BankingAccount(3000, "Tim", 0.01);
		banking.monthlyUpdate();

		
	}
}
