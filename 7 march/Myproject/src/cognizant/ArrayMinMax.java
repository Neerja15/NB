package cognizant;

import java.util.Scanner;

public class ArrayMinMax {
	   public int max(int [] arr) {
		      int max = 0;
		     
		      for(int i=0; i<arr.length; i++ ) {
		         if(arr[i]>max) {
		            max = arr[i];
		         }
		      }
		      return max;
	   }
			   public int min(int [] arr) {
				      int min = arr[0];
				     
				      for(int i=0; i<arr.length; i++ ) {
				         if(arr[i]<min) {
				            min = arr[i];
				         }
				      }
				      return min;
			   }
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
        
        ArrayMinMax m = new ArrayMinMax();
        System.out.println("Maximum element = " + m.max(a));
        System.out.println("Minimum element = " + m.min(a));
	}

}
