package cognizant.date;

import java.time.LocalDate;

public class EqualDate {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2020, 02, 29);
		
		if(date2.equals(date1))
		{
			System.out.println("Date 2 is  " + date2);
			
		}
		else
		{
			System.out.println("Different dates are given");
		}

	}

}
