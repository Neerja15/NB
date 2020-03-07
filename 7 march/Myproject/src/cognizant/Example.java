package cognizant;


 
	class C
	{
		int x=10;
		public void display()
		{
			System.out.println("Class C");
			
		}
		
	}
	
	class D extends C
	{
		@Override
		public void display()
		{
			System.out.println("Class D");
			
		}
	}
	
	

public class Example 
{
	public static void main(String[] args) {
		
		C a=new D();
		a.display();
	}
}