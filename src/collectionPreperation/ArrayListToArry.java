package collectionPreperation;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArry {
	public static void main(String[] args) {	
	List<Object> list1=Arrays.asList(10,"Employee",'a',"Details");
	Object[] data = list1.toArray(new Object[list1.size()]);
	for(Object e:data) {
		System.out.println(e);
		
	}
	
	}
}
