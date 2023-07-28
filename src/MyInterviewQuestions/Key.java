package MyInterviewQuestions;

import java.util.HashMap;

public class Key {
	public static void main(String[] args) {
		String[] l1 = { "k1-v1", "k2-v2"};
		HashMap<String, String> output = new HashMap<>();

		for (String item : l1) {
			String[] keyValue = item.split("-");
			if (keyValue.length == 2) {
				String key = keyValue[0];
				String value = keyValue[1];
				output.put(key, value);
			}
		}

		System.out.println(output);
	}

}
