package cognizant;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {

int j;
			Scanner sc = new Scanner(System.in);
			System.out.print("Input number of rows: ");
	       int row=sc.nextInt();
	        int [] a =new int[row];    
	        int [] b = new int [a.length];
	    
	        System.out.println("Enter elements of array a:");
	        for( j=0; j<a.length; j++)
	        {
	        	
	                a[j]=sc.nextInt();
	            	
	            }
	        
	        for( j=0; j<a.length; j++)
	        {
	        	
	              b[j]= a[j];
	            	
	            }
	        System.out.println("Elements of array b:");
	        for( j=0; j<b.length; j++)
	        {
	        	
	               System.out.println(b[j]);
	            	
	            }

	}

}
