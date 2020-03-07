package cognizant.date;

import java.time.LocalDate;

public class BeforeAfterOneYear {

	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		
		LocalDate prev = today.minusYears(1);
		
		LocalDate next = today.plusYears(1);
		
		System.out.println("Today : " + today);
		System.out.println(" Previous Year : " + prev);
		System.out.println(" Next Year : " + next);
	}

}
