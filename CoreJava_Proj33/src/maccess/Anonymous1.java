package maccess;
import test.*;
public class Anonymous1 {
	public static void main(String[] args) {
		System.out.println("===generalisation process===");
		PClass ob2=new PClass() 
		{
			public void m1(int x) {
				System.out.println("*****CCLass m1()********");
				System.out.println("x::"+x);
			}//end of method
			public void m3(int z) {
				System.out.println("*****CCLass m3()**********");
				System.out.println("z::"+z);
			}//end of method
		}; //endd of anonymous class
		ob2.m1(11);
		ob2.m2(12);
		//ob2.m3(13);  //compilation error
	}//end of main method
}//end of class
