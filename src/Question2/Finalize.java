package Question2;

public class Finalize {
	@Override
	public void finalize() {
		//System.out.println("Collected");
	}

	public static void main(String[] args) {
		Finalize f1 = new Finalize();
		//System.out.println(f1.hashCode());
		f1 = new Finalize();
		System.out.println(f1); // memoryAddress
		System.gc();
		Finalize f2 = new Finalize();
		//System.out.println(f2.hashCode());
		System.gc();
	}

}
