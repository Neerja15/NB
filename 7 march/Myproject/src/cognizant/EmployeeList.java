package cognizant;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		
		
		ArrayList<Empp> list = new ArrayList<>();
		 System.out.println("---------Sort by Name--------------------");
		addEmpp(list);
		Collections.sort(list, new SortByName());
		
	    for(Empp emp: list) {
	    	System.out.println(emp);
	    }
	    System.out.println("---------Sort by Id--------------------");
	    Collections.sort(list, new SortById());
	    for(Empp emp: list) {
	    	System.out.println(emp);
	    }
	    System.out.println("---------Sort by Age--------------------");
	    Collections.sort(list, new SortByAge());
	    for(Empp emp: list) {
	    	System.out.println(emp);
	    }
	    System.out.println("---------Sort by NO--------------------");
	    Collections.sort(list, new SortByPhNo());
	    for(Empp emp: list) {
	    	System.out.println(emp);
	    }
	}
	
		/*addEmpp(list);
		Collections.sort(list);
		for(Empp emp : list)
		{
			System.out.println(emp);
		}
		//System.out.println(list);
			}*/

	private static void addEmpp(ArrayList<Empp> list) {

		Empp emp1 = new Empp(5234, "Neerja", "Pune", "Developer", 20,40000, 9825614455l);
		Empp emp2 = new Empp(2134, "Harshita","Indore", "Developer", 21,30000, 9995614455l);
		Empp emp3 = new Empp(3124, "Pulkit", "Pune", "Developer", 22,40000, 9825664455l);
		Empp emp4 = new Empp(4123, "Naveen", "Pune", "Developer", 20,40000, 9225614455l);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}
