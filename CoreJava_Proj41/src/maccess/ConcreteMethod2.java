package maccess;
import test.*;
public class ConcreteMethod2 {
	public static void main(String[] args) {
		ITest ob=(int y)->{
			System.out.println("****m2()******");
			System.out.println("y::"+y);
		};//end of lambda expression
		ob.m1(123);
		ob.m2(124);
	}//end of main method
}//end of class
