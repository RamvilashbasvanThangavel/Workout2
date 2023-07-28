package Question6;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsData {
	public static void main(String[] args) {
		int total = 0;
		int data = 5;
		for (int i = 0; i <= data; i++) {
			total += i;
		}
		System.out.println("Before java8 = " + total);

		int total1 = IntStream.rangeClosed(0, 5).sum();
		System.out.println("After Java8 = " + total1);

	}
}
