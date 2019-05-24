
public class Prog3 {
	int i = 0;
	class MyThread extends Thread {
		MyThread(String str) {
			super(str);
		}
		public void run() {
			incrementI();
		}
	}
	synchronized void incrementI() {
		System.out.println("This is " + Thread.currentThread().toString());
		System.out.println("Old value: " + i++ + "\nNew value: " + i + "\n\n");
	}

	public static void main(String args[]) {
		Prog3 tmp = new Prog3();
		for(int i = 0; i < 10; i++) {
			MyThread temp = (tmp. new MyThread("I am thread " + (i + 1)));
			temp.start();
			try {
				temp.join();
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}