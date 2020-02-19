package cognizant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> list = new HashSet<>();
		//LinkedHashSet<String> list = new LinkedHashSet<>();
		TreeSet<String> list = new TreeSet<>();
		list.add("Hello");
		list.add("To");
		list.add("Java");
		list.add("Batch");
		list.add("Batch");
		list.add("7");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) 
		{
			
			String element = it.next();
			System.out.println(element);
		}
	}

}
