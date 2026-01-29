package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>, Measurable {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public int compareTo(Student o) {
		if (gpa < o.gpa)
			return -1;
		else if (gpa > o.gpa)
			return 1;
		else return 0;		
		// Another option
		//return (int) Math.round((gpa - o.gpa)*10);	
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Mickey Mouse", 3.0));
		students.add(new Student("Donald Duck", 2.5));
		students.add(new Student("Goofy", 3.9));
		for (Student s : students)
			System.out.println(s);
		System.out.println("Sorted");
		Collections.sort(students);
		for (Student s : students)
			System.out.println(s);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public double getMeasure() {
		return gpa;
	}



}
