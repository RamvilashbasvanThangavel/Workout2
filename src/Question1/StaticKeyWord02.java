package Question1;

public class StaticKeyWord02 {
	public static void main(String[] args) {
		StaticKeyWord02 s1 = new StaticKeyWord02();
		StaticKeyWord02 s2 = new StaticKeyWord02();
		StaticKeyWord02 s3 = new StaticKeyWord02();
	}

	static int a = 0; // with static KeyWord in variable

	public StaticKeyWord02() {
		a++;
		System.out.println(a);
	}

	static {
		System.out.println("This is a static block");
	}

}
