package MyInterviewQuestions;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int year = s1.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
}

