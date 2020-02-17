package cognizant;

import java.util.Scanner;

 class Parent
{


	String name;
	String gender;
	


}
class Employee extends Parent
{
	 int empid;
}
class Manager extends Employee
{
	String dept;
}
class Hr extends Employee
{
	int hrid;
}
	
class Developer extends Manager
{
	int projid;
	String tech;

	
}
class Test extends Manager
{
	
	void fun()
	{
		int testid;
		Scanner sc= new Scanner(System.in);
		testid= sc.nextInt();  
		System.out.println("output"+ testid);
	}



	
	public static void main(String[] args)
	{
	
		Test t = new Test();
		t.fun();
		
		
}
}
