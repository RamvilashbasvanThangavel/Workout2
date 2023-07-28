package Question5;

public class Palindrome01 {
	public static void main(String[] args) {
		String a = "MalayalaM";
		String Ram = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			Ram = Ram + a.charAt(i);
		}
		if (Ram.equals(a)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Not a Plaindrome");
		}
	}

}

