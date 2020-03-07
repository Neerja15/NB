package cognizant.date;

import java.time.Clock;;
public class ClockTime {

	public static void main(String[] args) {
		
		Clock time = Clock.systemUTC();
		Clock def = Clock.systemDefaultZone();
		System.out.println(time);
		System.out.println("Default : " +  def);
		
		
		

	}

}
