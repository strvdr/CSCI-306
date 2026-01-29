/**
 * CompSciMajor class. 
 *  
 * @author Strydr Silverberg 
 * @author Kale Carlson
 * 
 * Date: 1/28/2026
 * Purpose:  Represents a Computer Science Major, which is a child of a Person.
 * */

import java.util.Random;

public class CompSciMajor extends Person {

	//constructor takes in a name an an occupation
	public CompSciMajor(String name, String occupation) {
		super(name, occupation);
	}
	
	// answerQuestion generates a random integer between 1 and the number of questions available, 
	//and then selects an answer based on a switch case statement
	public void answerQuestion(){
		Random random = new Random();
		int answers = 6;
		int randInt = random.nextInt(1, answers);
		
		switch(randInt) {
			case 1:	
				System.out.println("I love Computer Science!");
				break;
			case 2:	
				System.out.println("Binary is cool!");
				break;
			case 3:				
				System.out.println("I like coding in Java! (not really)");
				break;
			case 4:				
				System.out.println("1010110111101");
				break;	
			case 5:				
				System.out.println("Runs on my machine.");
				break;
			case 6:				
				System.out.println("All your base are beling to us.");
				break;
		}
	}
	
	//Same function as above, generates a rand int between 1 and the number of questions and picks a question
	//with a switch case statement
	public void askQuestion(){
		Random random = new Random();
		int questions = 6;
		int randInt = random.nextInt(1, questions);
		
		switch(randInt) {
			case 1:	
				System.out.println("Did you understand that lecture?");
				break;
			case 2:	
				System.out.println("Where's my next class?");
				break;
			case 3:				
				System.out.println("Do you know where Coolbaugh 201 is?");
				break;
			case 4:				
				System.out.println("1010110111101?");
				break;	
			case 5:				
				System.out.println("How many bits are in a byte?");
				break;
			case 6:				
				System.out.println("How many bytes is a ULL?");
				break;
		}	
	}

	//Overrides the parent classes whatIDo function and adds additional details
	@Override
	public void whatIDo() {
		super.whatIDo();
		System.out.println("I'm going to graduate in 2 years!");
	}
}
