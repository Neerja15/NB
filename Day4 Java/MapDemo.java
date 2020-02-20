package cognizant;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class MapDemo {

	public static void main(String[] args) {
		//HashMap<String , Integer> map = new HashMap<>();
		//LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		//Hashtable<String , Integer> map = new Hashtable<>();
		//Hashtable<String , String> map = new Hashtable<>();
		TreeMap<String , Integer> map = new TreeMap<>();
		map.put("Banana",35);
		map.put("Orange",60);
		map.put("Mango",110);
		map.put("Grapes",200);
		map.put("Watermelon",20);
		map.put("Banana",70);
		//map.put(null,"0");
		//map.compute("water", null);

		
		for(Entry<String, Integer> entry : map.entrySet())
		{
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		
		System.out.println(map.get("Grapes"));
		System.out.println(map.isEmpty());
		System.out.println(map.remove("Grapes",200));
		System.out.println(map.replace("Orange", 60, 120));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.clone());
		System.out.println(map.containsKey("Watermelon"));
		System.out.println(map.containsValue(110));
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		
	}
}

