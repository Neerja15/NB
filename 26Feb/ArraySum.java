package cognizant;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {


int sum=0,j;
			Scanner sc = new Scanner(System.in);
			System.out.print("Input number of rows: ");
	       int row=sc.nextInt();
	        int [] a =new int[row];    
	        System.out.println("Enter elements of array a:");
	        for( j=0; j<a.length; j++)
	        {
	        	
	                a[j]=sc.nextInt();
	            	
	            }
	        for( j=0; j<a.length; j++)
	        {
	        	
	        	   sum=sum+a[j];
	            	
	            }
	     
       	 System.out.println("Sum : " + sum);
	}

}
