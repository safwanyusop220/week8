package Q1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new MyThread();
		Thread thread2 = new MyThread();

		
		Thread printerThread1 = new Thread(thread1, "Thread #1");
		Thread printerThread2 = new Thread(thread1, "Thread #2");
		
		printerThread1.start();
		printerThread2.start();
	}

}
