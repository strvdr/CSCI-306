import java.awt.Point;
import java.util.ArrayList;

public class ArrayListPlay {

	public static void main(String[] args) {
		ArrayList things = new ArrayList();
		things.add("Cyndi");
		things.add(new Point(5,6));
		for (Object o: things)
			System.out.println(o);
		for (int i=0; i<2; i++)
			System.out.println(things.get(i));
		String getString = (String) things.get(0);
		Point getPoint = (Point) things.get(1);
		System.out.println(getPoint.x);
		ArrayList<Point> points;
		points = new ArrayList<Point>();
		points.add(new Point(3,4));
		Point p = points.get(0);
		points.add(new Point(5,6));
		System.out.println("Original points");
		for (Point p2 : points)
			System.out.println(p2.getX());
		points.set(1, new Point(8, 9));
		System.out.println("Revised points");
		for (Point p2 : points)
			System.out.println(p2.getX());
		System.out.println("Number of points before remove: " + points.size());
		points.remove(0);
		System.out.println("Number of points after remove: " + points.size());
		System.out.println(points.get(0));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Integer wrappedInt = new Integer(5);
		numbers.add(wrappedInt);
		numbers.add(new Integer(15));
		numbers.add(12);
		int[] bigData = new int[100000];
		
	}

}
