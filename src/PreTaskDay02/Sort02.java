package PreTaskDay02;

import java.util.Arrays;

public class Sort02 {
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 10, 15, 2 };
		Arrays.sort(a);
		System.out.println("Second Largest Array " + a[a.length - 2]);
	}
}
