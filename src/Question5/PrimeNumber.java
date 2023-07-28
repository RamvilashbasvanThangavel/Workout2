package Question5;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 7;
		String prime = "Prime";
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = "Not Prime";
			}
		}
		System.out.println(prime);
	}

}
