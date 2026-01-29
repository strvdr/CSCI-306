
// Java primitive arrays.
public class ArrayBasics {
	public static void main(String[] args) {
		// Always have to use new, unlike C++.
		// Values default to 0.0 or whatever primitive
		// default value, as best as Java can.
		double [] data = new double[10];
		data[0] = 1.5;
		System.out.println(data[0]);
		System.out.println(data[1]);	
		
		// Can also initialize an array with an initializer list.
		int[] primes = {2, 3, 5, 7, 11};
		
		// Arrays have a built-in .length property.
		for (int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + " ");
		}
		System.out.println();
		System.out.println("Length: " + primes.length);	
		
		// If you try to access an array out of bounds, Java
		// thrown an ArrayIndexOutOfBoundsException, unlike C++.
		System.out.println(primes[primes.length]);		
	}

}
