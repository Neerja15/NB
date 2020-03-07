package cognizant;

import java.util.Comparator;

public class SortByAge implements Comparator<Empp> {

	
	
	@Override
	public int compare(Empp emp1, Empp emp2) {
		
		if(emp1.getAge()> emp2.getAge())
		{
			return 1;
		}
		else if(emp1.getAge() == emp2.getAge())
		{
			return 0;
			
		}
		else {
			return -1;
		}
		
	}
	
}