package PreTaskDay02;

import java.util.Arrays;

public class Sort01 {
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 10, 15, 2 };
		Arrays.sort(a);
		for (Integer x : a) {
			System.out.println(x);
		}
	}
}
