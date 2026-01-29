import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class RestrictedFileTotal {
	private int sum;
	private String inFile;

	public RestrictedFileTotal(String inFile) {
		this.inFile = inFile;
	}

	public void sumFileValues()  {
		FileReader reader = null;
		Scanner in = null;
		String strNum = null;
		try {
			reader = new FileReader(inFile);
			in = new Scanner(reader);
			while (in.hasNext()) {
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				if (num < 0)
					throw new NegativeNumberException(num);
				sum += num;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error, non-numeric value " + strNum);
		}
	}
	
	public void displaySum() {
		System.out.println("Sum is " + sum);
	}
	
	public static void main(String[] args) {
		RestrictedFileTotal ft = new RestrictedFileTotal("numbers.txt");
		try {
			ft.sumFileValues();
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		ft.displaySum();

	}

}
