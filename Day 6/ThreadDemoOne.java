package cognizant;

public class ThreadDemoOne {


		public static void main(String[] args) {

			System.out.println(Thread.currentThread().getName());
			ThreadOneImpl threadOne = new ThreadOneImpl();
			ThreadTwoImpl threadTwo = new ThreadTwoImpl();
			Thread t1= new Thread(threadOne);
			Thread t2= new Thread(threadTwo);
			
			t1.start();
			t2.start();
			/*for(int i=1; i<=5; i++)
			{
				System.out.println(Thread.currentThread().getName()+ " :  "  +i);
			}*/
			
			
			
		}

	}


