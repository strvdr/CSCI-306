package files_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LineNumberer {	
	private String inputFile;
	private String outputFile;
	
	public void setoutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public void setinputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	
	public void numberLines() throws FileNotFoundException {
		FileReader reader = new FileReader(inputFile);
		Scanner in = new Scanner(reader);
		PrintWriter out = new PrintWriter(outputFile);
		int lineNumber = 1;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			out.println("/* " + lineNumber + " */ " + line);
			lineNumber++;
		}		
		out.close();	
	}
	public void promptForInputFile() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		inputFile = scan.next();
	}
	
	public void chooseFileName() {
		JFileChooser chooser = new JFileChooser();
		// APPROVE_OPTION is static int
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			inputFile = selectedFile.getAbsolutePath();
		}		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// Option 1: hardcode names
		LineNumberer lines1 = new LineNumberer();
		lines1.setinputFile("input.txt");
		lines1.setoutputFile("output.txt");
		lines1.numberLines();
		// Option 2: prompt user
		LineNumberer lines2 = new LineNumberer();
		lines2.setoutputFile("srcCode.out");
		lines2.promptForInputFile();
		lines2.numberLines();
		// Option 3: file chooser
		LineNumberer lines3 = new LineNumberer();
		lines3.setoutputFile("srcCode2.out");
		lines3.chooseFileName();
		lines3.numberLines();	
		// Option 4: command line arg
		LineNumberer lines4 = new LineNumberer();
		lines4.setoutputFile("srcCode3.out");
		if (args.length > 0)
		{
			lines4.setinputFile(args[0]);
			lines4.numberLines();
		}
	}

}
