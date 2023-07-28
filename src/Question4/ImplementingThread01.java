package Question4;

public class ImplementingThread01 implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		ImplementingThread01 it1 = new ImplementingThread01();
		Thread t = new Thread(it1);
		t.start();
	}

}
