package PreTaskDay03;

public class gettingAddtionNumbers {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 5;
		int l = 0;
		int r = a.length - 1;
		while (l < r) {
			if (a[l] + a[r] > sum) {
				r--;
			} else if (a[l] + a[r] < sum) {
				l++;
			} else if (a[l] + a[r] == sum) {
				System.out.println(a[l] + "" + a[r]);
				r--;
				l++;
			}
		}

		while (l > r) {
			if (a[l] + a[r] > sum) {
				r++;
			} else if (a[l] + a[r] < sum) {
				l--;
			} else if (a[l] + a[r] == sum) {
				System.out.println(a[l] + "" + a[r]);
				r++;
				l--;
			}
		}
	}
}
