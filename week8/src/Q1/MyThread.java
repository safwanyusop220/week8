package Q1;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  


public class MyThread extends Thread{
	
	public void printTime (String currentThread) {	
	
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
		
			System.out.println(currentThread + "  :  " + dtf.format(now));
	}
}
	

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		
		printTime(currentThread.getName());
		
		
	}
}