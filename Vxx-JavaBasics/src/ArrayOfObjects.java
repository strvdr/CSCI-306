import java.awt.Point;

public class ArrayOfObjects {
	public final static int MAX_POINTS = 20;
	private int numPoints;
	private Point[] points;
	
	public ArrayOfObjects() {
		points = new Point[MAX_POINTS];
	}
	
	public void createPoints() {
		Point aPoint = new Point(5,6);
		points[0] = aPoint; 
		numPoints++;
		aPoint = new Point(10, 20);
		points[1] = aPoint; 
		numPoints++;
		aPoint.setLocation(15, 30);
		points[2] = aPoint;		
		numPoints+= 1;
	}
	
	public void printPoints() {
		for (int i=0; i<numPoints; i++)
			System.out.println(points[i].getX() + " " + points[i].getY());
	}

	public static void main(String[] args) {
		ArrayOfObjects demo = new ArrayOfObjects(); 
		demo.createPoints(); 
		demo.printPoints();		
	}

}
