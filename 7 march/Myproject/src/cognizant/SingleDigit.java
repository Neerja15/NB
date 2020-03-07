package cognizant;
import java.util.Scanner;

public class SingleDigit {
	  static int NumberofTimes(String str) 
	  {
	 
    int sum1 = 0, count = 0 ; 
   
   
    while (str.length() > 1) 
    { 
       sum1 = 0; 
   
    
     
		for (int i = 0; i < str.length(); i++) 
           sum1 += ( str.charAt(i) - '0' ) ; 
   
      
        str = sum1 + "" ; 
   
     
        count++; 
    }
	return count; 
	  }
    public static void main(String[] args)  
    { 
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter string : ");
     String s =sc.nextLine();

         System.out.println("Count =  " +NumberofTimes(s));  
    } 
  
} 


