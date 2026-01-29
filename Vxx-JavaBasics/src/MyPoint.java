
public class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		MyPoint p2 = new MyPoint(5, 6);
		System.out.println(p1.getX());
		System.out.println(p2.getX());
	}

}
