package cognizant;

import java.util.Scanner;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int j,i,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of rows: ");
       int row=sc.nextInt();
        int [] a =new int[row];    
        System.out.println("Enter elements of array a:");
        int len= a.length;
        
        for( j=0; j<len; j++)
        {
        	
                a[j]=sc.nextInt();
            }
        for(j=0;j<a.length; j++)
        {
        	for(i=j+1 ; i<a.length;i++)
        	{
        	  
                      if(a[j] > a[i]) {    
                         temp = a[j];    
                         a[j] = a[i];    
                         a[i] = temp;    
        	}
        }
  	}
        System.out.println("Second largest Element : " +a[len-2]);
	}

}
