package cognizant;
import java.util.Scanner;
import java.util.Arrays; 
public class AlphabetSort
{
	
 
	
	  
	    public static String sortString(String a) 
	    { 
	    
	        char str[] = a.toCharArray(); 
	          
	
	        Arrays.sort(str); 
	          
	        return new String(str); 
	    } 
	      
	
	    public static void main(String[] args) 
	    { 
	    	Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string : ");
	        String a = sc.nextLine();
	     
	        String output = sortString(a); 
	          
	        System.out.println("Input String : " +a); 
	        System.out.println("Output String : " + output); 
	    } 
	} 