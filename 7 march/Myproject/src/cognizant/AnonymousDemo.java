package cognizant;

//	class Hello{
//
//		public void sayHello()
//	{
//		System.out.println("Hi!!");
//		
//	}
//	}
//	
//	public class AnonymousDemo {
//	public static void main(String[] args) {
//		
//		{
//			Hello h = new Hello()
//			{
//			@Override
//			public void sayHello()
//			{
//				System.out.println("Inner class made using Concrete CLass");
//			}
//			};
//			h.sayHello();	
//		}
//		}
//		
//	}

//interface Hello
//{
//	public void sayHello();
//}
//public class AnonymousDemo {
//	public static void main(String[] args) {
//		
//		{
//			Hello hinter = new Hello()
//			{
//			@Override
//			public void sayHello()
//			{
//				System.out.println("Inner class made using Interface");
//			}
//			};
//			hinter.sayHello();	
//		}
//		}
//}

abstract class Hello
{
	public abstract void sayHello();
}
public class AnonymousDemo {
	public static void main(String[] args) {
		
		{
			Hello habstract = new Hello()
			{
			@Override
			public void sayHello()
			{
				System.out.println("Inner class made using Abstract class");
			}
			};
			habstract.sayHello();	
		}
		}
}


