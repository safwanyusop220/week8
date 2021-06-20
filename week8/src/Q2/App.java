package Q2;

public class App {

	public static void main(String[] args) {
	
		MyRunnable text = new MyRunnable();
		Thread word1 = new Thread(text);
		Thread word2 = new Thread(text);
		
		word1.start();
		word2.start();
	}
}