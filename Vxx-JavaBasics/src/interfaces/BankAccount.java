package interfaces;

public class BankAccount implements Measurable {
	private String name;
	private double balance;

	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	@Override
	public double getMeasure() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}



	
}