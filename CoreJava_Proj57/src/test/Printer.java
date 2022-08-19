package test;

public class Printer {
	public static synchronized void print(int n,String uName) {
		for(int i=1;i<=n;i++) {
			System.out.println(uName+" Print out::"+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}//end of for loop
	}//end fo method

}
