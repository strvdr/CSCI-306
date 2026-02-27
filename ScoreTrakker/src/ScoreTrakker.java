import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscores.txt", "nofile.txt"};
	
	public ScoreTrakker() {
	}
	
	private void printInOrder() {
		Collections.sort(students);
		for(Student stud: students) {
			System.out.println(stud);
		}
	}
	
	private void loadDataFile(String filename) throws FileNotFoundException { 
		students.clear();
		String score = new String();
		String name = new String();
			
		FileReader filereader = new FileReader(filename);
		Scanner in = new Scanner(filereader);
		while(in.hasNext()) {
			try {
				name = in.next() + " " + in.next();
				score = in.next();
				Student student = new Student(name, Integer.parseInt(score));
				students.add(student);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + score);	
				System.out.println();
			}
		}
		in.close();
	}
		

	private void processFiles() { 
		System.out.println("Student Score List: ");
		for(String file : files) { 
			try {
				loadDataFile(file);
				this.printInOrder();
			} catch(FileNotFoundException e) {
				System.out.println("File not found: " + file);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) { 
		ScoreTrakker scoretrakker = new ScoreTrakker();
		scoretrakker.processFiles();
	}

}
