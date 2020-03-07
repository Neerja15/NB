package cognizant.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		
		ZoneId zi = ZoneId.of("Asia/Calcutta");
		LocalDateTime datet= LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(datet, zi);
		
		System.out.println("Date-Time = " + zdt);
	}

}
