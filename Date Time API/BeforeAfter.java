package cognizant.date;

import java.time.LocalDate;

public class BeforeAfter {

	public static void main(String[] args) {
			LocalDate today = LocalDate.now();
			
			LocalDate tom = LocalDate.of(2020, 02, 28);
			if(today.isBefore(tom))
				System.out.println(" Before TRUE");
			if(today.isAfter(tom))
			System.out.println(" After TRUE");
	}

}
