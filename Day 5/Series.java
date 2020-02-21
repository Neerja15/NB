package cognizant;

public class Series {

	public static void main(String[] args) {
		
		int n=36,  a,i;
		//System.out.println("Enter the size of series");
		
		for(i=1 ; i<=10;i++)
		
		{
			if(i%2==0) 
			{
				n=n-4;
				System.out.print(" " +n);
				
			}
			else
			{		
				n=n-2;
			System.out.print(" " +n);
			}
			}
			

	}

}











// 36,34,30,28,24,22,18,16,12,10