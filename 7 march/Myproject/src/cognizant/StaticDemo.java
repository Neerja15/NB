package cognizant;

 public class StaticDemo
 {
	public static void main(String[] args) {
		 Exa d= new Exa();
		 Exa d1 = new Exa();
		 Exa d2 = new Exa();
		 
		 System.out.println(d.x);
		 System.out.println(d.y);
		 d2.x=50;
		 d1.y=30;
			
		 System.out.println(d.x);
		 System.out.println(d2.y);
		
	} 
 }
 
 class Exa{
	 	int x=10;
	 	static int y=20;
	static public void show()
	{
		System.out.println(y);
		
	}
}
