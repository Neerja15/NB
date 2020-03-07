package cognizant.date;

import java.time.LocalDate;

public class AfterOneWeek {

	public static void main(String[] args) {

		LocalDate today= LocalDate.now();
		LocalDate next = today.plusWeeks(1);
		System.out.println(today);
		System.out.println("After 1 week : " + next);

	}

}
