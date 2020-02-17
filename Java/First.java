package cognizant;


import java.util.*;
public class First {

	public static void main(String[] args) {

		
		int n,sum = 0;

  Scanner sc= new Scanner (System.in);
  n= sc.nextInt();  
        while (n != 0) 
        { 
        	
            sum = sum + (n%10);
            n = n/10; 
        } 
        
		System.out.println("Sum" +sum);
}
}
 