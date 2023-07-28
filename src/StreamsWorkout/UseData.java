package StreamsWorkout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseData {
	public static void main(String[] args) {
		Data e1 = new Data("Ram", 1181, 35000, "Male", 'T', "Executive");
		Data e2 = new Data("Kavi", 1187, 55000, "Female", 'D', "SeniorExecutive");
		Data e3 = new Data("Muthu", 1180, 48000, "Male", 'A', "Manager");
		Data e4 = new Data("Arun", 1179, 250000, "Male", 'K', "SenoirManager");
		Data e5 = new Data("Surya", 1178, 280000, "Male", 'K', "SenoirManager");
		Data e6 = new Data("Pavi", 1156, 35000, "Male", 'T', "Executive");
		Data e7 = new Data("Ramya", 1184, 75000, "Female", 'D', "Executive");
		Data e8 = new Data("Sakthi", 1159, 28000, "Male", 'A', "Manager");
		Data e9 = new Data("Naveen", 1118, 50000, "Male", 'K', "SenoirManager");
		Data e10 = new Data("Sara", 1172, 270000, "Female", 'D', "SenoirManager");

//Storing the Data
		List<Data> details = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		// details.forEach(x -> System.out.println(x));
//List to Map		
		Map<Integer, Data> map = details.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));
		// map.values().forEach(y -> System.out.println(y));
		// map.keySet().forEach(x->System.out::println);
//Map to List
		List<Data> listvalue = map.values().stream().toList();
		List<Integer> listkey = map.keySet().stream().toList();
		// listvalue.forEach(x -> System.out.println(x));
		// listkey.forEach(x -> System.out.println(x));
//Filter	
		// details.stream().filter(x->x.getGender().equals("Male")).toList().forEach(System.out::println);
//map
		// details.stream().map(x ->
		// x.getGender()).toList().forEach(System.out::println);
//count 
		long c1 = details.stream().filter(x -> x.getGender().equals("Female")).count();
		// System.out.println(c1);
//Duplicate
		List<Integer> ch = details.stream().map(x -> x.getSalary()).distinct().sorted().toList();
		//System.out.println(ch);

		Set<Integer> duplicate = new HashSet<>();
		Set<Integer> dup = details.stream().filter(x -> !duplicate(x)).map(x -> x.getSalary())
				.collect(Collectors.toSet());
		System.out.println(dup);

	}

	private static boolean duplicate(Data x) {
		// TODO Auto-generated method stub
		return false;
	}
}
