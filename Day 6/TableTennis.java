package cognizant;

public class TableTennis {


	public  static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Player 1 is ready");
		System.out.println("Player 2 is ready");
		Resource res = new Resource();
		ThreadPing ping = new ThreadPing();
		ThreadPong pong = new ThreadPong();
		Thread t1= new Thread(ping);
		Thread t2= new Thread(pong);
		t1.start();
		
		t2.start();

}
}
