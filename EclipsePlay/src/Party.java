import java.util.ArrayList;

public class Party {
	private ArrayList<Friend> people;

	public Party() {
		people = new ArrayList<Friend>();
	}

	public void addPeople() {
 people.add(new Friend("Mark", "baldwin"));
 people.add(new Friend("Jane", "jsmith"));
 people.add(new Friend("Joe", "jdoe"));
	}

	public void showPeople() {
		System.out.println("Who's Coming to the Party?");
		for (Friend person : people) {
			System.out.println(person);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Party party = new Party();
		party.addPeople();
		party.showPeople();

	}

}
