package StreamsWorkout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFlatMapEx2 {
	public static void main(String[] args) {
		List<String> details1 = Arrays.asList("Ram", "Ramya", "MeghalaPriya", "Manju", "Keerthi", "Rithika", "Harini");
		List<String> details2 = Arrays.asList("Ram", "Pavi", "Kavi", "Shamla", "Sinthya", "Manju", "Harini", "Sathana",
				"Ram", "Ram");

//Merging two List.
		List<List<String>> data = Arrays.asList(details1, details2);
		// System.out.println(data);
//Storing in a Single List.
		List<String> getData = data.stream().flatMap(x -> x.stream()).toList();
		// System.out.println(getData);
//getting data in ascending order.	
		List<String> asce = getData.stream().sorted().toList();
		// System.out.println(asce);
//getting data in descending order.	
		List<String> desc = getData.stream().sorted(Collections.reverseOrder()).toList();
		// System.out.println(desc);
//removing data of duplicate value.
		List<String> dupremoval = getData.stream().distinct().toList();
		// System.out.println(dupremoval);

//getting duplicate values from List
		Set<String> duplicate = new HashSet<>();
		Set<String> dup = getData.stream().filter(x -> !duplicate.add(x)).collect(Collectors.toSet());
		// System.out.println(dup);

//count of duplicate String
		Long cou = dup.stream().count();
		// System.out.println(dup + " is count =" + cou);

//count of Each String
		String ab = "The dog is my dog so dont touch my dog";
		Map<Object, Long> dupCount = Arrays.stream(ab.split(" "))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(dupCount.entrySet());
		dupCount.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times."));
	}

}
