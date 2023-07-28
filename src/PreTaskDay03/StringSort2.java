package PreTaskDay03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort2 {
	public static void main(String[] args) {
		String a = "1,5,3,8,2,9,";
		String a1[] = a.split(",");
		int temp = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			temp = Integer.parseInt(a1[i]);
			list.add(temp);
		}
		Integer[] data = list.toArray(new Integer[list.size()]);
		Arrays.sort(data);
		for (Integer x : data) {
			System.out.println(x);
		}
	}
}