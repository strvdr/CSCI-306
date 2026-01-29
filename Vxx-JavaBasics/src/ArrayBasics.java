
public class ArrayBasics {
	public static void main(String[] args) {
		// C++: double data[10];
		double [] data = new double[10];
		data[0] = 1.5;
		System.out.println(data[0]);
		System.out.println(data[1]);	
		int[] primes = {2, 3, 5, 7, 11};
		for (int i=0; i<primes.length; i++) 
			System.out.print(primes[i] + " ");
		System.out.println();
		System.out.println("Length: " + primes.length);	
		System.out.println(primes[primes.length]);		
	}

}
