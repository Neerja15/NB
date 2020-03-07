package cognizant;

import java.util.Scanner;

public class SmsLingo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in) ;

	String nm=sc.nextLine();
	String nm2=sms(nm);
	System.out.println("Replaced String = "+nm2);	


	
}
static String  sms(String modification)
{	String a=modification;  
	a=a.replaceAll("you","u");
    a=a.replaceAll("yes", "s");
    a=a.replaceAll("why","y");
    a=a.replaceAll("today", "2day");
  	return a;
}

}



