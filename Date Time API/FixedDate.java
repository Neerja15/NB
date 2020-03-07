package cognizant.date;

import java.time.Month;
import java.time.YearMonth;

public class FixedDate {

	public static void main(String[] args) {
		
		YearMonth today = YearMonth.now();
		
		System.out.println("Today : " + today.getMonthValue());
		
		YearMonth fix= YearMonth.of(2019, Month.AUGUST);
		System.out.println(" Fixed date : " + fix);

	}

}
