package test;

public class User2 implements Runnable{
	public Printer p=null;
	public User2(Printer p) {
		this.p=p;
	}
	public void run() {
		synchronized(p) {
		p.print(5,Thread.currentThread().getName());
		}//end of lock
	}//end of method
}//end of class
