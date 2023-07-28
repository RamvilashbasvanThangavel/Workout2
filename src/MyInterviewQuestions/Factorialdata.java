package MyInterviewQuestions;

public class Factorialdata {
	public static int factorial(int num) {
		for (int i = num - 1; i > 1; i--) {
			num *= i;
		}
		return num;
	}

	public static void main(String[] args) {
		int number = 5;
		int factTotal = 1;

		if (number > 0) {

			factTotal = factorial(number);

			System.out.print(factTotal);
		} else
			System.out.println("This is a negative number");
	}
}
