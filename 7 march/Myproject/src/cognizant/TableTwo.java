package cognizant;

public class TableTwo implements Runnable  
	{


			@Override
			public void run()
			{
				int num = 4;
				
				for(int i = 1; i <= 10; ++i)
		        {
					
		            System.out.printf(" Table of 4 : %d * %d = %d \n", num, i, num * i);
		            try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
			}
				

}
