package cognizant;

import java.util.Comparator;

public class SortById implements Comparator<Empp> {

	
	
	@Override
	public int compare(Empp emp1, Empp emp2) {
		
		if(emp1.getId()> emp2.getId())
		{
			return 1;
		}
		else if(emp1.getId() == emp2.getId())
		{
			return 0;
			
		}
		else {
			return -1;
		}
		
	}
}
	
