package cognizant.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		// 1. Print names with length more than 6
		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println("Names with length greater than 6!!");
		nameList.forEach(System.out::println);

		// 2.Names in Upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Names in Uppercase!!");
		namesInUpper.forEach(System.out::println);

		
		long count= names.stream().count();
		System.out.println("List COunt is : "+ count);
		Stream<Integer> data= Stream.of(1,11,111,1111);
		System.out.println("Data Count : " +data.count());
		
		
		Stream<String> languages = Stream.of("C","C++"," Java","Python","Angular");
	List<String> sizecalc = languages.filter(s -> s.length()>4).collect(Collectors.toList());
		sizecalc.forEach(System.out::println);
		
		Stream<String> lang = Stream.of("C","C++","Java","Python","Angular");
		List<String> result = lang.map(s -> s.concat(" Programming")).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Sorting !!");
		defaultSorted.forEach(System.out::println);
		
		List<String> customSorted = names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Descending order Sorting !!");
		customSorted.forEach(System.out::println);
		
		
	}

	private static void addNames(ArrayList<String> names) {
		names.add("Neeraj");
		names.add("Harshita");
		names.add("Rajshree");
		names.add("Pulkit");
		names.add("Abhishek");
		names.add("Mayuresh");

	}

}
