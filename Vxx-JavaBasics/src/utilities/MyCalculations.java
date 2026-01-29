package utilities;

public class MyCalculations {
	public static int calcPerimeter(int length, int width) {
	     return 2 * (length + width);
	  }

	public static void main(String [] args) {
	  // Ensure output is 16
	  System.out.println(MyCalculations.calcPerimeter(2,6));
	  }

}
