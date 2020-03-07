package cognizant;

public class Demo1 {

	private Demo1()
	{
		
	}
	public void task2()
	{
		System.out.println("From task2 of class Demo1");
	}
}

class Test1{
	 
	 void check()
	   {
	   Demo1.task2();
	  }
	
}