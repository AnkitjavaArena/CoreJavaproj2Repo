package test;

public class Display2 implements Runnable {
	public void run() {
		for(int i=101;i<=105;i++) {
			System.out.println("Task two::"+i);
			try {
				Thread.sleep(4000);
			}//end of try block
			catch(InterruptedException ie){
				ie.printStackTrace();
			}//end of catch block
		}
	}//end of run method
}//end of class
