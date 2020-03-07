package cognizant;
import java.util.Scanner;
public class Toggle1 {
	{
		public static void main(String[] args) 
		{
		System.out.println("Enter a Word");
		Scanner sc=new Scanner(System.in);
		String first =sc.nextLine();
		System.out.println("Enter a Word");
	
		String afterfirst =sc.nextLine();
		String toggle=" ";
		char[] arr = first.charAt(i);
		//char[] arr= line.toCharArray();
		for(char ch: arr)
		  {
		if(Character.isUpperCase(ch))
		{
		ch= Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch))
		{
		    ch= Character.toUpperCase(ch);
		}
	 
	       toggle+= Character.toLowerCase()+ Character.toUpperCase()+" ";  
		
		System.out.print(ch);
		}}}
}
