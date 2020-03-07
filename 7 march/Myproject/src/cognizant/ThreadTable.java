package cognizant;

public class ThreadTable  {

	public  static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Resource res = new Resource();
		TableOne tableOne = new TableOne();
		TableTwo tableTwo = new TableTwo();
		Thread t1= new Thread(tableOne);
		Thread t2= new Thread(tableTwo);
	
		t1.start();
				t1.join();
		t2.start();

		
	
	}
}
