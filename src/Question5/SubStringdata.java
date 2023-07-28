package Question5;

public class SubStringdata {
	public static void main(String[] args) {
		String a = "Javan";
		String b = "Developer";
		int c = a.length() / 2;
		String d = a.substring(0, c).concat(b).concat(a.substring(c, a.length()));
		System.out.println(d);
	}

}
