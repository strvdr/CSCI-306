package enumDemo;

public enum DayOfWeek { 
	MONDAY ("Monday"), TUESDAY ("Tuesday"), WEDNESDAY ("Wednesday"),
	THURSDAY ("Thursday"), FRIDAY ("Friday");
	private String value;
	
	DayOfWeek (String aValue) {
		value = aValue;
	}
	
	public String toString() {
		return value;
	}
	
}


