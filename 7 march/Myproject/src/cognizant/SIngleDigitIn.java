package cognizant;

public class SIngleDigitIn {
	
	   static int NumberofTimes(String str) 
	    { 
	       
	        int temporary_sum = 0, count = 0; 
	       
	       
	        while (str.length() > 1) 
	        { 
	            temporary_sum = 0; 
	       
	        
	            for (int i = 0; i < str.length(); i++) 
	                temporary_sum += ( str.charAt(i) - '0' ) ; 
	       
	          
	            str = temporary_sum + "" ; 
	       
	         
	            count++; 
	        } 
	       
	        return count; 
	    } 
	      

	    public static void main(String[] args)  
	    { 
	         String s = "991"; 
	         System.out.println(NumberofTimes(s));  
	    } 
	  
	} 
	

