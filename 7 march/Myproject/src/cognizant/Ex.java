package cognizant;

interface Add
{
	int add(int a, int b);
	
	default int mul (int a, int b)
	{
		return a*b;
	}
	static int mod (int a, int b)
	{
		return a%b;
	}
	
}
interface Sub extends Add
{
	int sub(int a, int b);
	
}
class Div
{
	public int div(int a, int b)
	{
		return a/b;
	}
}
class Imp extends Div implements Add , Sub
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}
public class Ex {
	public static void main(String[] args) {
		
		Imp i=new Imp();
		System.out.println(i.add(3, 4));
		System.out.println(i.sub(7,4));
		System.out.println(i.div(8,4));
		
		Add a = new Imp();
		System.out.println(a.mul(8,4));
		//System.out.println(Add.mod(9,4));
	}

}
