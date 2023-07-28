package Question5;

public class PangramEx {
	public static void main(String[] args) {
		String a = "The quick brown fox jumps over the lazy dog";
		String b = a.toUpperCase();
		String pan = "Pangram";
		for (char p = 'A'; p <= 'Z'; p++) {
			if (a.indexOf(p) >= 65 && a.indexOf(p) <= 92) {
				pan = "Not a Pangram";
			}
		}
		System.out.println(pan);
	}
}
