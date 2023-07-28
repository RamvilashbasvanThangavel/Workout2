package collectionPreperation;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		int[] a = { 10, 12, 20, 30, 40 };

		List<Integer> list = new ArrayList<>();
		for (Integer i : a) {
			list.add(i);
		}
		System.out.println(list);

	}
}
