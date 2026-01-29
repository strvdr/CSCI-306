package files_exceptions;

public class AutoTeller {
	private ATM atm;
	
	public AutoTeller(double balance) {
		super();
		atm = new ATM(balance);
	}	

	public void doWithdrawal() {
		try {
			double withdrawAmount = atm.withdrawal();
			// code that does something with customer
			if (true) {
				System.out.println("Withdrawal of: " + withdrawAmount);
				atm.deductWithdrawal(withdrawAmount);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		AutoTeller teller = new AutoTeller(300);
		teller.doWithdrawal();
		
	}

}
