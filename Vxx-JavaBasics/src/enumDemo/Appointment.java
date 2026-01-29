package enumDemo;

public class Appointment {
	private DayOfWeek whichDay;

	public Appointment(DayOfWeek whichDay) {
		super();
		this.whichDay = whichDay;
	}
	
	public DayOfWeek getWhichDay() {
		return whichDay;
	}

	public static void main(String[] args) {
		Appointment appt = new Appointment(DayOfWeek.MONDAY);
		System.out.println(appt.getWhichDay());
		Appointment appt2 = new Appointment(DayOfWeek.valueOf("TUESDAY"));
		System.out.println(appt2.getWhichDay());
		

	}



}
