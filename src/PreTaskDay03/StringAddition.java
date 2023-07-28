package PreTaskDay03;

public class StringAddition {
	public static void main(String[] args) {
		String data = "2+3-2+10+12";
		String[] a = data.split("[+-]");
		String[] b = data.split("\\d+");

		int result = Integer.parseInt(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (b[i].equals("+")) {
				result += Integer.parseInt(a[i]);
			} else if (b[i].equals("-")) {
				result -= Integer.parseInt(a[i]);
			}
		}
		System.out.println(result);
	}
}