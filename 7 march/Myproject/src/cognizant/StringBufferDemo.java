package cognizant;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append(" Helloto Java Version 8");
		System.out.println(sb.capacity());	
		sb.append("This is my version for Development");
		System.out.println(sb.capacity());
		sb.insert(7, " Hi");
		System.out.println(sb);
		sb.replace(7, 20, "Welcome to Java");
		System.out.println(sb);
		sb.delete(6, 15);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
}
