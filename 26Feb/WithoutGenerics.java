package cognizant;

public class WithoutGenerics {



	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		WithoutGenerics type = new WithoutGenerics();
		type.set("Pankaj"); 
		String str = (String) type.get(); 
		System.out.println(str);
	}
}

