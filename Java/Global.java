package cognizant;

public class Global {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="Global Warming";
		 String t ;
		 if( str==null || str.length()<5)
		 {
			 t=str;
		 }
		 else
		 {
			 t= str.substring(str.length()-4);
		 }
		  
	        System.out.println("Last  four characters are:" + t );
	     
	        
	        String b = str.substring(4,9);
		 System.out.println(b);  
	       
		 
         boolean g = (str != null) &&
                 str.chars().allMatch(Character::isLetterOrDigit);
         System.out.println("Alphanumeric= " +g);
         
         int len = str.length();
         String h = str.substring(0,len-4);
         System.out.println("Last Four=" +h);
		 

	        String e = str.substring(4);
			 System.out.println("First four= "+e);  
		       
		 int a=str.indexOf("Wa");
	        System.out.println(a);
	      

	        
	                String d= "";
	                for (int x = 0; x < str.length(); x++)
	                {  
	                    char c = str.charAt(x);
	                    boolean check = Character.isUpperCase(c);
	                    if (check == true)
	                        d = d + Character.toLowerCase(c);
	                    else
	                        d = d + Character.toUpperCase(c);
	                }
	                System.out.println ("Case of string = " +d);
	        
	                String r=str.replaceAll("a","*");
	                System.out.println(r); 
	
	
	                boolean result= false;
	                String[] arr=str.split("\\s");
	              for(int i=0; i<arr.length;i++)
	              {  
	              
	                char ch = arr[i].charAt(0);
	                if (ch>=65&&ch<=90)
	                {
	  	                    result = true;
	                }
	                else
	                {
	                	result = false;
	                	break;
	                }
	         
	              }
	              System.out.println("Title "+ result); 

	}
}
	       
	           

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


