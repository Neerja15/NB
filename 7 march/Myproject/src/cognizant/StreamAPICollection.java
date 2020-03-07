package cognizant;

import java.util.ArrayList;

public class StreamAPICollection {

	public static void main(String[] args) {
		int i;
		ArrayList<Integer> list = new ArrayList();
		list.add(20);
		list.add(40);
		list.add(35);
		list.add(80);
		list.add(62);
		ArrayList<Integer> list1 = new ArrayList();
	       System.out.println(list);
	   for( i=0;i<=list.size();i++) 
	   {
		   if(list.get(i)%2==0 && list.get(i)%5==0)
		   {
			   System.out.println(list.get(i) );
		   }
	   }
	   for ( i = 0; i < list.size(); i++) 
	   {
		 list1.add(list.get(i)*2);
		 
	
	   }
	 System.out.println(list1);
	}

}
