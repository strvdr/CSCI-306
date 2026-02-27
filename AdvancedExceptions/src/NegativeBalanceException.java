//Authors: Strydr Silverberg, Kale Carlson
// Purpose: NegativeBalanceException definition

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("serial")
//extends exception so that we get runtime exception checking
public class NegativeBalanceException extends Exception {
	private double negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	// catch and log errors regarding withdrawing more money than in bank account
	public NegativeBalanceException(double nb) {
		super("Amount exceeds balance by " + nb);
		negativeBalance = nb;
		try {
			FileWriter writer = new FileWriter("logFile.txt");
			String writerMsg = "Amount exceeds balance by " + nb;
			writer.write(writerMsg);
			writer.close();
		} catch (IOException e) {
			System.out.println("ERROR: could not find logfile.txt file");
		}
	}
	
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
}
