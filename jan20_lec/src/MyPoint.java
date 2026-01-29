
// Classes and objects.
public class MyPoint {
	// Private integer attributes of this class.
	// Only this class can access _x and _y.
	private int _x, _y;

	// Constructor, hand it two values and it will
	// set the internal attributes.
	// Can have Eclipse generate this from the Source menu.
	public MyPoint(int x, int y) {
		super();
		this._x = x;
		this._y = y;
	}

	// Since _x is private, offer a public getter.  Eclipse
	// can generate this, too.
	public int getX() {
		// this is optional but reminds you that you are referring
		// to the _x attribute of the class, not just some local
		// variable.
		return this._x;
	}

	// Override the toString method that Object has.
	// This will get called anytime MyPoint needs to be treated
	// as a String.
	// The @Override annotation tells the compiler you are overriding
	// a method...this way if you misspell it, you'll get an error.
	@Override
	public String toString() {
		return "MyPoint [_x=" + _x + ", _y=" + _y + "]";
	}

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		MyPoint p2 = new MyPoint(5, 6);
		System.out.println(p1.getX());
		System.out.println(p2.getX());
		
		// This will call our toString method.
		// If you comment out our toString above, this will
		// call the Object version of toString which prints
		// the class name and a memory address.
		System.out.println(p1);
	}

}
