package cognizant;

public class MODemo {

	public void add(int a, int b)
	{
		System.out.println("hi");
	}
	public void add(double c ,double d)
	{
		System.out.println("Hello");
	}
	public void add(float c ,float d)
	{
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		
		MODemo m = new MODemo();
		m.add(9.08f, 9.09f);
		
	}
}

