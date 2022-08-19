/*Create thread using anonymous innerclass
 * 
 */


package maccess;

public class DemoThread2 {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable()
				{
				public void run() {
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
				});
		
		Thread t2=new Thread(new Runnable()
		{
		public void run() {
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
		});
		
		t1.start();//calling run() method
		t2.start();
	}//end of main
}//end of class
