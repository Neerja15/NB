package cognizant.date;

import java.time.LocalTime;

public class AddHours {

	public static void main(String[] args) {
		
		
		LocalTime hours = LocalTime.now();
		LocalTime addhours =hours.plusHours(3);
		System.out.println(hours);
		System.out.println(addhours);
	}

}
