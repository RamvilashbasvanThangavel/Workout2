package Question4;

public class ExtendingThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		ExtendingThread et1 = new ExtendingThread();
		et1.start();
	}

}
