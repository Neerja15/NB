package cognizant;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
		
		/*for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " :  "  +i);
		}*/
		
		
		
	}

}
