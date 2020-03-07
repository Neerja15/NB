package cognizant;

import java.io.Console;

public class ConsoleClass
{
   
		public static void main(String args[]) 
		{    
		Console c = System.console();
		System.out.println("Enter your name");
		String name = c.readLine();
		System.out.println(" Name = " + name);
		System.out.println("Enter Password");
		char ch[] = c.readPassword();
		String pass = String.valueOf(ch);
		System.out.println("Password = " + pass);

		if(name.equals("Harsh") && pass.equals("abc123"))
		{
			System.out.println("Welcome : " + name);
		}
		else
		{
			System.out.println("Invalid");
		}
		}
}	
		