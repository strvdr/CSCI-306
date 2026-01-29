
public class BankAccount {
	private String name;
	private double balance;
	private int accountNum;
	private static int lastAccountNum;	

	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
		BankAccount.lastAccountNum++;
		accountNum = BankAccount.lastAccountNum;
	}	
	
	public void showLastAccountNum() {
		System.out.println("Last account: " + BankAccount.lastAccountNum);
	}

	
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + ", accountNum=" + accountNum + "]";
	}

	public static void main(String[] args) {
		BankAccount mine = new BankAccount("Jim", 5000);
		mine.showLastAccountNum();
		BankAccount yours = new BankAccount("Sally", 10000);
		yours.showLastAccountNum();	
		mine.showLastAccountNum();
		System.out.println(mine.toString());
		System.out.println(yours);

	}
	
}

