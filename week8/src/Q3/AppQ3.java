package Q3;
public class AppQ3 {

	public static void main(String[] args) {
	
		MyRunnableQ3 text1 = new MyRunnableQ3();
		MyRunnableQ3 text2 = new MyRunnableQ3();
		MyRunnableQ3 text3 = new MyRunnableQ3();
		
		Thread word1 = new Thread(text1, "Word 1");

		Thread word2 = new Thread(text2, "Word 2");
		
		Thread word3 = new Thread(text3, "Word 3");
		
		word1.start();
		word2.start();
		word3.start();
	}
}