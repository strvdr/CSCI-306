
// NullPointerException
public class NullPointerDemo {
	// A class that contains an instance of another class.
	private MyPoint aPoint;

	public NullPointerDemo() {
		// Don't redeclare it here - this would make a local
		// variable, not instantiate our private attribute!
		//MyPoint aPoint = new MyPoint(5, 6);
		
		aPoint = new MyPoint(5, 6);
	}	
	
	// If you comment out the constructor above, this method
	// will throw a NullPointerException because aPoint would
	// not have been instantiated yet.
	public void showMyPoint() {
		System.out.println(aPoint.getX());	
	}
	
	// If thePoint here is null, that's ok - we can print null
	// and can return null, we just can't access it with the 
	// dot notation.
	public MyPoint showAPoint(MyPoint thePoint) {
		System.out.println(thePoint);
		return thePoint;
	}	

	public static void main(String[] args) {
		NullPointerDemo npd = new NullPointerDemo();
		npd.showMyPoint();
		MyPoint somePoint = null;
		MyPoint otherPoint = npd.showAPoint(somePoint);
		System.out.println(otherPoint);
		
	}

}