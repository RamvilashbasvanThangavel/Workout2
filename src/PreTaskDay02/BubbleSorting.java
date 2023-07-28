package PreTaskDay02;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 10, 15, 2 };
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(Integer r :a) {
			System.out.println(r);
		}
		System.out.println("Second Smallest - "+a[1]);
	}
}
 