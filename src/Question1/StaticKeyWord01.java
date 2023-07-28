package Question1;

public class StaticKeyWord01 {
	public static void main(String[] args) {
		StaticKeyWord01 s1 = new StaticKeyWord01();
		StaticKeyWord01 s2 = new StaticKeyWord01();
		StaticKeyWord01 s3 = new StaticKeyWord01();
		StaticKeyWord01 s4 = new StaticKeyWord01();
	}

	int a = 0;

	public StaticKeyWord01() {
		a++;
		System.out.println(a);
	}

	static {
		System.out.println("This is a static block");
	}

}
