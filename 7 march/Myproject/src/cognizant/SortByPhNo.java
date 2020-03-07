package cognizant;

import java.util.Comparator;

public class SortByPhNo implements Comparator<Empp> {

	
	
	@Override
	public int compare(Empp emp1, Empp emp2) {
		
		if(emp1.getPhone()> emp2.getPhone())
		{
			return 1;
		}
		else if(emp1.getPhone() == emp2.getPhone())
		{
			return 0;
			
		}
		else {
			return -1;
		}
		
	}
	

}
	



