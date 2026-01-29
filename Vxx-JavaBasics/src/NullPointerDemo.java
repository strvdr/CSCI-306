
import java.awt.Point;

public class NullPointerDemo {
	private Point aPoint;

	public NullPointerDemo() {
		aPoint = new Point(5,6);
	}	
	
	public void showMyPoint() {
		System.out.println(aPoint.x);	
	}
	public Point showAPoint(Point thePoint) {
		System.out.println(thePoint);
		return thePoint;
	}	

	public static void main(String[] args) {
		NullPointerDemo npd = new NullPointerDemo();
		npd.showMyPoint();
		Point somePoint = null;
		Point otherPoint = npd.showAPoint(somePoint);
		System.out.println(otherPoint);
		
	}

}