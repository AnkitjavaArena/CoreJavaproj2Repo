//creating thread using Lambda expression


package maccess;

public class DemoThread3 {
	public static void main(String[] args) {
		Thread t1=new Thread(()-> {
					for(int i=1;i<=5;i++) {
						System.out.println("Task-one::"+i);
						try {
							Thread.sleep(4000);
						}
						catch(InterruptedException ie)
						{
							ie.printStackTrace();
						}
					}//end of loop
				}
				);
		
		Thread t2=new Thread(()->{
			for(int i=101;i<=105;i++) {
				System.out.println("Task-two::"+i);
				try {
					Thread.sleep(4000);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}//end of loop
		}
		);
		
		t1.start();//calling run() method
		t2.start();
	}//end of main
}
