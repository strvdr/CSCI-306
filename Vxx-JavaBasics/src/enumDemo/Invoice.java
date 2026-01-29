package enumDemo;

public class Invoice {
	public enum Status { PAID, UNPAID, WRITE_OFF};
	private Status status;
	private double balance;

	public Invoice(double balance) {
		super();
		this.balance = balance;
		status = Status.UNPAID;
	}
	
	public Invoice(Status status, double balance) {
		super();
		this.status = status;
		this.balance = balance;
	}	
	
	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Invoice [status=" + status + ", balance=" + balance + "]";
	}
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice(3000);
		Invoice invoice2 = new Invoice(Status.PAID, 2000);
		System.out.println(invoice);
		System.out.println(invoice2);
	}
	

}
