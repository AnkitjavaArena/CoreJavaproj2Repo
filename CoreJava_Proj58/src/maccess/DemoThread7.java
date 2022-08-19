package maccess;
import test.*;
public class DemoThread7 {
	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t1.setName("Producer");
		t2.setName("Consumer");
		
		t2.start();
		t1.start();
	}//end of main method
}//end of class
