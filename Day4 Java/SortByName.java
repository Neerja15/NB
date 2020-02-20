package cognizant;

import java.util.Comparator;

public class SortByName  implements Comparator<Empp> {

	
	
	@Override
	public int compare(Empp emp1, Empp emp2) {
		
		return emp1.getName().compareTo(emp2.getName());
		
	}
	
}