package cognizant;

public class TableOne implements Runnable  
{


		@Override
		public void run()
		{
			
				
			
			int num = 2;
	
			for(int i = 1; i <= 10; ++i)
	        {
				
	            System.out.printf("Table of 2 : %d * %d = %d \n", num, i, num * i);
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		}
		
			


}
