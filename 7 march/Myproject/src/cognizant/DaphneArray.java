package cognizant;

import java.util.Scanner;

public class DaphneArray
{
	public static void main(String[] args) {
		
	int startcount=0, endcount=0 , odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of rows: ");
       int row=sc.nextInt();
        int [] a =new int[row];    
        System.out.println("Enter elements of array a:");
        for(int j=0; j<row; j++)
        {
        	
                a[j]=sc.nextInt();
            }
        


        int len = a.length;
        for(int j=0 ;j<len;j++)
        {
        	if( a[j]%2!=0)
        	{
        		
        		odd++;
 
        	}
        }
        for(int j=0 ;j<len;j++)
        {
        	if( a[j]%2==0)
        	{
   
        		startcount++;
 
        	}
        	else
        	{
        		break;
        		
        	}
        }
        for(int j=len-1 ;j>0;j--)
        {
        	if( a[j]%2==0)
        	{
       
        		endcount++;
 
        	}
        	else
        	{
        		break;
        		
        	}
        }
        if(startcount==endcount && odd>=1)
        {
        	System.out.println("Daphne Array");
        }
        else
        {
        	System.out.println("Not a Daphne Array");
        }
        		
       
}
}
	
