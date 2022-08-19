package maccess;
import test.*;
public class Anonymous2 {
	public static void main(String[] args) {
		System.out.println("Generalisation process(Anonymous)::");
		ITest ob2=new ITest()
				{
					public void m1(int x) {
						System.out.println("********m1()************");
						System.out.println("x::"+x);
					}//end of method
					public void m2(int y) {
						System.out.println("******m2()******");
						System.out.println("y::"+y);
					}//end of method
				}; //end  of child class
	ob2.m1(11);
//	ob2.m2(12);  //compilation error
	}//end of main
}//end of class
