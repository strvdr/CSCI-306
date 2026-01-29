import java.util.Scanner;


public class SimpleInput {
	private String theName;
	private int age, score;

	public void fillFields() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		theName = scan.nextLine();
		System.out.print("Enter your age: ");
		String storeAge = scan.next();
		try {
			age = Integer.parseInt(storeAge);
		} catch(NumberFormatException e){
			System.out.println("That's not a number!");
		}
		System.out.print("Enter your test score: ");
		String scoreStr = scan.next();
		try {
			score = Integer.parseInt(scoreStr);
		} catch (NumberFormatException e)
		{
			System.out.println("That is not a number!");
		}		
	}
	
	@Override
	public String toString() {
		return "SimpleInput [theName=" + theName + ", age=" + age + ", score="
				+ score + "]";
	}

	public static void main(String[] args) {
		SimpleInput si = new SimpleInput();
		si.fillFields();
		System.out.println(si);
	}

}
