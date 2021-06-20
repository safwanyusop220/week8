package Q2;
import java.util.*;
public class MyRunnable implements Runnable {
	
	public void display () {
		
		String[] text = {"It", "is", "recommended", "to","use", "Calendar", "class"};

		 List<String> list = Arrays.asList(text);
		 
		 for (int counter = 0; counter < 10; counter++) {
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 Collections.shuffle(list);
			 
			 int i = counter + 1;
			 System.out.println("Word " + i + " : ");
			 for (String string : list) {
				 System.out.print(string + " ");
			 }
			 System.out.println(".");
		 }
		
	}
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		display();

		
	}

}
