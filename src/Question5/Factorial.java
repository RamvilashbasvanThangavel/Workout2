package Question5;

public class Factorial {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("First Highest number in Array = " + max);

		int fact = 1;
		for (int i = 1; i <= max; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
