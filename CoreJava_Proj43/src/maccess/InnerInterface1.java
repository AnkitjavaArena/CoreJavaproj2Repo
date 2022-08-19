package maccess;
import test.*;
public class InnerInterface1 {
	public static void main(String[] args) {
		SubClass.ITest ob1=(int x)->{
			System.out.println("x::"+x);
		};
		ob1.m1(123);
		ITest.ITest2 ob2=(int y)->{
			System.out.println("y::"+y);
		};
		ob2.m2(124);
		AClass.ITest3 ob3=(int z)->{
			System.out.println("z::"+z);
		};
		ob3.m3(125);
	}//end of main method
}//end of class
