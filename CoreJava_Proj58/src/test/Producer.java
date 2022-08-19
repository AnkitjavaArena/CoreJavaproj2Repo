package test;

public class Producer implements Runnable{
	public StringBuffer sb=null;
	public Producer() {
		sb=new StringBuffer();
	}
	public void run() {
		synchronized(sb) {
			for(int i=1;i<=10;i++) {
				sb.append(i+":");
				System.out.println(Thread.currentThread().getName()+" is appending");
				try {
					Thread.sleep(2000);
				}//end of try
				catch(Exception e) {
					e.printStackTrace();
				}
			}//end of loop
			sb.notify();
			//open the lock and pass the msg to waiting thread 
		}//end of lock
	}//end of run method
}//end of class
