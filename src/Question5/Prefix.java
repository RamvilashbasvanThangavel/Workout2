package Question5;

public class Prefix {
	public static void main(String[] args) {
		String[] a = { "Ram", "Ramanadan", "Ramya", "Ramdev" };
		String[] b = a[0].split(",");
		String prefix = "Ram";
		for (int i = 0; i < b.length; i++) {
			if (b[i].startsWith(prefix)) {
				System.out.println(prefix);
			} else {
				System.out.println("Check The Array To change Preix word");
			}
		}

	}

}
