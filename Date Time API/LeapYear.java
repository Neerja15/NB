package cognizant.date;

import java.time.LocalDate;

public class LeapYear {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		
		if(today.isLeapYear())
		{
			System.out.println("Leap Year");
			
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
