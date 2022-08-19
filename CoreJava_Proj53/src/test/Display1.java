package test;

public class Display1 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task-1::"+i);
			try {
				Thread.sleep(4000);
			}//end of try
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}//end of catch
		}//end of for loop
	}//end of run() method
}//end of class
