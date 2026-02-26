import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public ScoreTrakker() {
	}
	
	private void printInOrder() {
		Collections.sort(students);
		for(Student stud: students) {
			System.out.println(stud);
		}
	}
	
	private void loadDataFile(String filename) { 
		try {
			FileReader filereader = new FileReader(filename);
			Scanner in = new Scanner(filereader);
			while(in.hasNext()) {
				Student student = new Student(in.next() + " " + in.next(), in.nextInt());
				students.add(student);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private void processFiles() { 
		loadDataFile("scores.txt");
		this.printInOrder();
	}
	
	public static void main(String args[]) { 
		ScoreTrakker scoretrakker = new ScoreTrakker();
		scoretrakker.processFiles();
	}

}
