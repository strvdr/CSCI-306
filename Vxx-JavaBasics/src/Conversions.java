
public class Conversions {
	public final static double FEET_TO_METERS = 0.3048;
	
	public static double convertFtToMeters(double feet) {
		return feet * FEET_TO_METERS;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-15));
		System.out.println(Math.pow(2, 3));
		double feet = 1;
		double meters = convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");

		
	}

}
