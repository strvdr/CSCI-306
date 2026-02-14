/**
 * Setting enum
 *  
 * @author Strydr Silverberg
 * @author Kale Carlson
 * 
 * 2/2/2026
 * Purpose: implements a Setting enum for use with the Burner class.
 */
public enum Setting {
	OFF ("---"),
	LOW ("--+"),
	MEDIUM ("-++"),
	HIGH ("+++");
	
	private String level;
	
	//enum constructor takes in a string as parameter
	Setting (String aLevel) {
		level = aLevel;
	}
	
	// toString prints the current setting level of the burner
	public String toString() {
		return level;
	}
}