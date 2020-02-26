package cognizant;

import java.util.Scanner;

public class ArrayReverse {

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
        System.out.println("Reverse Array = " );
        for(int j=a.length-1; j>=0; j--)
        {
        	
               System.out.println(a[j]+" ");
            }
        
	}

	}

