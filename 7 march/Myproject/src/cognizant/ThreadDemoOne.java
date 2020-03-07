package cognizant;

public class ThreadDemoOne {


		public static void main(String[] args) {

			Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);

			System.out.println(Thread.currentThread().getName());
			Resource res = new Resource();
			
			/*ThreadOneImpl threadOne = new ThreadOneImpl();
			ThreadTwoImpl threadTwo = new ThreadTwoImpl();
			Thread t1= new Thread(threadOne);
			Thread t2= new Thread(threadTwo);
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.NORM_PRIORITY+2);*/
			
			ThreadThree threadThree = new ThreadThree(res);
			ThreadFour threadFour = new ThreadFour(res);
			Thread t1= new Thread(threadThree);
			Thread t2= new Thread(threadFour);
			
			t1.start();
			t2.start();
			
			System.out.println("Main thread Priority : " +Thread.currentThread().getPriority());
			System.out.println("Thread 1 Priority : " +t1.getPriority());
			System.out.println("Thread 2 Priority : " +t2.getPriority());
			
			/*for(int i=1; i<=5; i++)
			{
				System.out.println(Thread.currentThread().getName()+ " :  "  +i);
			}*/
			
			
			
		}

	}


