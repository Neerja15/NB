package cognizant;

public class StringTest {
 public static void main(String[] args) {
	
	 {
		 String city1="Pune";
		 String city2="Mumbai";
		 String city3="Pune";
		 String city="" ;
		 String  city7="INDORE" ;
			
		 String city4= new String("Pune");
		 String city5= new String("Mumbai");
		 String city6= new String("Pune");
	
	 System.out.println(city1==city3);
	 System.out.println(city3.equals(city6));
	 System.out.println(city1==city4);
	  
	 String msg="I am an engineer";
	 System.out.println(msg.contains("an"));  
	 int a=msg.length();
	 System.out.println("Length of string = "+a);
	 String year=" of 2020";
	 String b=msg.concat(year);
	 System.out.println(b);
	 char ch=msg.charAt(5); 
	 System.out.println(ch);  
	 String c = msg.substring(5,15);
	 System.out.println(c);    
	 String d = msg.substring(9);
	 System.out.println(d);   

	 String r=msg.replace('a','e');  
	 System.out.println(r);  
	 String s=msg.replaceAll("2020","2019");  
	 System.out.println(s);
	 System.out.println(msg.endsWith("r")); 
     
	  boolean isContains = msg.contains("Engineer");  
      System.out.println(isContains);   
	 
	 System.out.println(city1.compareTo(city3)); 
	 System.out.println(city1.compareTo(city)); 
	 System.out.println(city1.compareTo(city2)); 
	 System.out.println(city1.equals(city7));
	 System.out.println(city1.equalsIgnoreCase(city2));
	 String e=String.format("name is %s",city1);  
	 String f=String.format("value is %f",32.33434);  
	 String g=String.format("value is %32.12f",32.33434);	 
	 String h=String.format("%c", 'c');
	 System.out.println(e);  
	 System.out.println(f);  
	 System.out.println(g); 
	 System.out.println(h);

}
 }
}


