package PreTaskDay02;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSort {
	public static void main(String[] args) {
		Integer a[] = { 2, 6, 7, 8, 10, 15, 2 };
		Arrays.sort(a,Collections.reverseOrder() );
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Second Largest Array " + a[a.length - 3]);
	}
}
