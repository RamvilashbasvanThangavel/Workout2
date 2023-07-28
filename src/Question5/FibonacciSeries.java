package Question5;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.print(a);
		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a);
		}
	}

}
