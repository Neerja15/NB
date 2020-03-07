package cognizant.date;

import java.time.LocalDate;
import java.time.MonthDay;

public class RecuuringEvents {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate bday=LocalDate.of(2019, 8, 15);
		MonthDay md = MonthDay.of(bday.getMonthValue(), bday.getDayOfMonth());
		MonthDay current = MonthDay.from(today);
		if(md.equals(current))
		{
			System.out.printf("date %s equal to %s : " + today,md);
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
