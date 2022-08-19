package maccess;
import test.*;
public class ConcreteMethod3 {
	public static void main(String[] args) {
		ITest ob=(int z)->{
			System.out.println("====m(z)====");
			System.out.println("z::"+z);
		}; //end of lambda expression
		System.out.println("*****Usinf default method*******");
		ob.dis1(12,13);  //default_method_call
		System.out.println("*****Using static method*******");
		ITest.dis2(ob,13,14);    //static method call
		ob.m(121);
	}//end of main method
}//end of class
