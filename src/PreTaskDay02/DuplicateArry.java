package PreTaskDay02;

public class DuplicateArry {
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 10, 15, 2, 10, 2 };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = '0';
				}
			}
			if (count > 1 && a[i] != '0') {
				System.out.println(a[i] + " is duplicate and repeated " + count+" times");
			}

		}
	}

}
