package test;

public class Consumer implements Runnable{
	public Producer prod=null;
	public Consumer(Producer prod) {
		this.prod=prod;
	}
	
	public void run() {
		synchronized(prod.sb) {
			System.out.println(Thread.currentThread().getName()+" got Blocked...");
			try {
				prod.sb.wait();  //thread blocked for messagee
				System.out.println("===Display using consumer====");
				System.out.println(prod.sb.toString());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}//end of class
