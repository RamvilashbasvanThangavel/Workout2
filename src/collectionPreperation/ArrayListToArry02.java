package collectionPreperation;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArry02 {
	public static void main(String[] args) {	
	List<Integer> list1=Arrays.asList(10,20,30,40);
	Integer[] data = list1.toArray(new Integer[list1.size()]);
	for(Object e:data) {
		System.out.println(e);
		
	}
	
	}
}
