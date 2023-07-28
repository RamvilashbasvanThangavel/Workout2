package collectionPreperation;

import java.util.HashMap;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Ramvilash", 78, "Male", 27);
		Student s2 = new Student("Arun", 101, "Male", 26);
		Student s3 = new Student("Muthu", 102, "Male", 25);
		Student s4 = new Student("Sintya", 101, "Male", 26);
		HashMap<Integer, Student> student = new HashMap<>(5);
		student.put(s1.getRollNumber(), s1);
		student.put(s2.getRollNumber(), s2);
		student.put(s3.getRollNumber(), s3);
		student.put(s4.getRollNumber(), s4);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2.equals(s4));
		student.values().forEach(x -> System.out.println(x));
	}

}
