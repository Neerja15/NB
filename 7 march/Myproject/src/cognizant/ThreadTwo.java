package cognizant;

public class ThreadTwo extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
		System.out.println("Thread-2 : " + i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	}

	
}
