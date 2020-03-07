package cognizant.date;

import java.time.LocalDate;

public class CurrentDayMonth {
	public static void main(String[] args) {
		
	
	LocalDate date = LocalDate.now();
	int day=date.getDayOfMonth();
	int month = date.getMonthValue();
	int year=date.getYear();
	System.out.println("Day : " +day+ " Month : " + month +" Year : " + year);
}
}