package maccess;
import test.*;
public class ConcreteMethod1 {
	public static void main(String[] args) {
		ITest.m1(122);
		ITest ob=(int y)->{
			System.out.println("****m2()********");
			System.out.println("y::"+y);
		};//end of lambda expression
		ob.m2(123);
	}//end of main method
}//end of class
