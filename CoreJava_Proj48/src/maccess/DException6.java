package maccess;

public class DException6 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println("Val::"+i);
			try {
				Thread.sleep(5000);  //method_call
			}//end of try
			catch(InterruptedException ei){
				ei.printStackTrace();
			}
		}//end of for loop
	}//end of main method
}//end of class
