package Question4;

public class ImplementingThread02 implements Runnable {
	@Override
	public void run() {
		synchronized(ImplementingThread02.class) {
		System.out.println("Thread is Running");
		try {
			ImplementingThread02.class.wait(1000); 
			System.out.println("Hello");
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ImplementingThread02 it1 = new ImplementingThread02();
		Thread t = new Thread(it1);
		t.start();
		Thread.sleep(2000);
		synchronized (t) {
			t.notify();
		}
		System.out.println("Hi");
	}

}
