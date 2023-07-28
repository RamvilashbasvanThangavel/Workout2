package PreTaskDay03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {
	public static void main(String[] args) {
		String b = "1,5,3,8,2,9,";
		String ab[] = b.split(",");
		int a1 = Integer.parseInt(ab[0]);
		int a2 = Integer.parseInt(ab[1]);
		int a3 = Integer.parseInt(ab[2]);
		int a4 = Integer.parseInt(ab[3]);
		int a5 = Integer.parseInt(ab[4]);
		int a6 = Integer.parseInt(ab[5]);
		List<Integer> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);		
		Integer[] data = list.toArray(new Integer[list.size()]);
		Arrays.sort(data);
		for (Integer x : data) {
			System.out.println(x);
		}
	}
}