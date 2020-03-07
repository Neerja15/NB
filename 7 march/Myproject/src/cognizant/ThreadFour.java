package cognizant;

public class ThreadFour implements Runnable {

	Resource resource;

	public ThreadFour(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread-2");
	}
}
