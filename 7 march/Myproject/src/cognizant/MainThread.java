package cognizant;

public class MainThread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		//System.out.println(t.setName("Thread1"));
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println(" is Daemon? : " + t.isDaemon());
		System.out.println(" is alive? : " + t.isAlive());
		
		
	}

}
