package files_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileTotal {
	private int sum;
	private String inFile;
	public FileTotal(String inFile) {
		this.inFile = inFile;
	}
	public void sumFileValues() {
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(inFile);
			in = new Scanner(reader);		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String strNum = null;
		try {
			while (in.hasNext()) {
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				sum += num;
			}
		} catch (NumberFormatException e) {
			System.out.println("Error, non-numeric value " + strNum);
		}
	}
	public void sumFileValues2() {
		String strNum = null;
		try {
			FileReader reader = new FileReader(inFile);
			Scanner in = new Scanner(reader);
			while (in.hasNext()) {
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				sum += num;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Error, non-numeric value " + strNum);
		}
	}	
	
	public void sumFileValues3() {
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(inFile);
			in = new Scanner(reader);		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		String strNum = null;
		while (in.hasNext()) {
			try {
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				sum += num;
			} catch (NumberFormatException e) {
				System.out.println("Error, non-numeric value " + strNum);
			}
		}
		System.out.println(sum);
		in.close();
	}
	public static void main(String[] args) {
		FileTotal ft = new FileTotal("numbers2.txt");
		ft.sumFileValues3();

	}

}
