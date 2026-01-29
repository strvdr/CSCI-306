
public class UseConversions {
	public static void main(String[] args) {
		double feet = 4;
		double meters = Conversions.convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");
	}
}
