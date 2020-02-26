package cognizant;

public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Neerja"); 
		String n = type.get();
		System.out.println(n);
		GenericsType<Integer> type1 = new GenericsType<>();
		
		type1.set(10); 
		int i =type1.get();
		System.out.println(i);
		//GenericsType<Integer> type1 = new GenericsType<>();
	
		
		
	}
}


