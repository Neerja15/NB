package cognizant;

public class FinalDemo {
/*public static final int A;
	
	
	static
	{
		A=20;
	}

	
		
		//A=20;
		{
			//A=20;
		}
		System.out.println(A);
		}*/
	public final int A;
	  FinalDemo()
	  {
		  A=20;
		  
	  }
public static void main(String[] args) {
	
	FinalDemo d= new FinalDemo();
	System.out.println(A);
}
}