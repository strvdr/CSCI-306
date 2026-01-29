
public class NegativeNumberException extends RuntimeException {
	public NegativeNumberException() {}
	public NegativeNumberException(String message) {
		super(message);
	}
	public NegativeNumberException(int number) {
		super("Error: value can't be < 0, input = " + number + 
			". Please contact tech support for a replacement file.");
	}	
}
