package cognizant;

import java.util.Scanner;

public class ArrayOddEven {

	
		public static void main(String[] args) {
			
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Input number of rows: ");
	       int row=sc.nextInt();
	        int [] a =new int[row];    
	        System.out.println("Enter elements of array a:");
	        for(int j=0; j<a.length; j++)
	        {
	        	
	                a[j]=sc.nextInt();
	            }
	        


	System.out.println("Odd elements are :");
	        for(int j=0 ;j<a.length;j++)
	        {
	        	if( a[j]%2!=0)
	        	{
	        		
	        		System.out.println(a[j]);
	 
	        	}
	        }
	        System.out.println("Even elements are :");
	        for(int j=0 ;j<a.length;j++)
	        {
	        	if( a[j]%2==0)
	        	{
	   
	        		System.out.println(a[j]);
	 
	        	}
	        }
		}
}
	        	
		
