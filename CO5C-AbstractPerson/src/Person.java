/**
 * Person class. 
 *  
 * @author Stryder Silverberg
 * @author Kale Carlson
 * 
 * Date: 1/28/2026
 * Purpose: Abstract Person class is the parent of Mascot, CompSciMajor, and Professor. These children inherit
 * common behavior between themselves from the Parent, namely whatIDo(), askName(), and giveName(). 
 */

public abstract class Person {
	
	private String occupation;
	private String myName;
	
	public Person(String myName, String occupation) {
		super();
		this.occupation = occupation;
		this.myName = myName;
	}
	
	public void askName() {
		System.out.println("What is your name?");
	}
	
	public void giveName() {	
		System.out.println("My name is " + myName);
	}
	
	public void whatIDo() {
		System.out.println("I am a " + occupation);
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public String getName() {
		return myName;
	}
	
	//ask question and answer question are abstract because each child of a Person
	//will have unique behavior for asking and answering questions. 
	public abstract void askQuestion();
	public abstract void answerQuestion();
}
