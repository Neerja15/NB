package cognizant;

public class ThreadThree implements Runnable {

	Resource resource;

	public ThreadThree(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread-1");
	}
}
