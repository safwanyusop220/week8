package Q3;

import java.util.*;

public class MyRunnableQ3 implements Runnable {
	
	public void display (String currentThread) {
		
		String[] text = {"It", "is", "recommended", "to","use", "Calendar", "class"};

		 List<String> list = Arrays.asList(text);
		 
		try {
		 
		 for (int counter = 1; counter < 11; counter++) {
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 System.out.println(currentThread + " : Thread Number -> " + counter  + "");
			 
			 if(currentThread == "Word 1") {
					System.out.println("\nSleep for 5 second. Name :"+currentThread);
					Thread.sleep(5000);
					//System.out.println("\n\nEnd sleep for 5 second\n\n");
				}
			 
			 
			 Collections.shuffle(list);
			 
			 int i = counter + 1;
			 //System.out.println("Word " + i + " : ");
			 for (String string : list) {
				 System.out.print(string + " ");
			 }
			 System.out.println(".\n");
		 }
		 

		 
		 
		 } catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread currentThread = Thread.currentThread();
		display(currentThread.getName());

		
	}

}
