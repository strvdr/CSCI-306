package publicSafety;

/**
 * Detective class
 * Represents an instance of a detective
 * Class's responsibility is for storage and retrieval of data about detectives. 
 * @author Strydr Silverberg
 * @author Kale Carlson
 * @date 1/25/26
 */

public class Detective {

	public Detective(String name) {
		super();
		this.name = name;
		this.badgeNumber = 0;
	}

	private String name;
	private int badgeNumber;
	
	public String getName() {
		return name;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		if(this != null) {	
			this.badgeNumber = badgeNumber;
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
