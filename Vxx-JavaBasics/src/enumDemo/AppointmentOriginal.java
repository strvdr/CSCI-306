package enumDemo;

import java.util.Scanner;

public class AppointmentOriginal {
	private int whichDay;
	private int scheduleLocation;
	public void scheduleAppointment() {
		System.out.println("Enter 1 for Monday, 2 for Tuesday or 3 for Thursday: ");  
		Scanner scan = new Scanner(System.in);
		whichDay = scan.nextInt();
		System.out.println("Enter 1 for Golden, 2 for Boulder or 3 for Lafayette: ");
		scheduleLocation = scan.nextInt();
	}



}
