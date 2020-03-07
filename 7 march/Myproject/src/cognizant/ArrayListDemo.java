package cognizant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList list = new ArrayList();
		// List list = new ArrayList();// This will display methods of list and not
		// arraylist
		//ArrayList<String> list = new ArrayList();
	LinkedList<String> list = new LinkedList();
		list.add("Hello");
		list.add("To");
		list.add("Java");
		list.add("Batch");
		list.add("7");
		list.addFirst("Start");
		list.addLast("End");

		/*Iterator<String> it = list.iterator();
		while (it.hasNext()) 
		{
			String element = it.next();
			System.out.println(element);
		}*/
		ListIterator<String> it = list.listIterator();
		System.out.println("Forward Direction");
		while (it.hasNext()) 
		{
			String element = it.next();
			System.out.println(element);
			/*if(element.equals("Java"))
			{
				break;
			}*/
		}
		System.out.println("Backward Direction");
		while (it.hasPrevious()) 
		{
			String element = it.previous();
			System.out.println(element);
		}
		System.out.println("The object at index is : " + list.get(2));
		

		// list.add(7);
		// list.add(true);
		System.out.println(list);
		list.remove(2);
		list.add(2, "Advanced Java");
		System.out.println("List contains Python?: " + list.contains("Python"));
		System.out.println("List size: " + list.size());
		/*
		 * for(Object obj : list)// Object is the super class! Since the list contains
		 * mixed datatypes thus Object is used to traverse {
		 * 
		 * System.out.println(obj); }
		 */
		for (String obj : list)// Object is the super class! Since the list contains mixed datatypes thus
								// Object is used to traverse
		{

			System.out.println(obj);

			if (obj.equals("Java")) {
				break;
			}
		}
	}
}
