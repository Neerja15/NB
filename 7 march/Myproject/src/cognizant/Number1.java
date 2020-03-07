package cognizant;

import java.util.Scanner;

public class Number1{

	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
//		
//		Number obj=new Number();
		int number2=find(number);
		
         System.out.println("New digit = " +number2);
	}
	public static  int lastDigit(int n) 
    { 
        return (n % 10); 
    } 

	public static int find(int number){
		int num=0,rem;
		int lastdigit=lastDigit(number);
	      while(number!=lastdigit )
	      {
	    	  rem=number % 10;
	    	  num=num+rem*10;
	      }
		return num;
	}
	


}

	
