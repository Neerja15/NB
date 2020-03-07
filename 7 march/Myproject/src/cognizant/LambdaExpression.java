package cognizant;

public class LambdaExpression {
	public static void main(String[] args) {

//		MyThread t = new MyThread();
//		Thread thread = new Thread(t);
//		thread.start();

//		Runnable r = () -> System.out.println("Hello Runnable");
//		Thread t = new Thread(r);
//		t.start();

		Hi h = () -> "Good Morning";
		System.out.println(h.greetings());
		Hi h1 = () -> "Good Evening";
		System.out.println(h1.greetings());
		Hi h2 = () -> "Good Night";
		System.out.println(h2.greetings());
	}

}

@FunctionalInterface
interface Hi {
	String greetings();
	// public void display();
}

//class MyThread implements Runnable
//{
//	@Override
//	public void run()
//	{
//		System.out.println("Hello Runnable");
//	}
//}