package maccess;
import test.*;
public class InnerClass2 {
	public static void main(String[] args) {
		ITest.SubClass2 ob2=new ITest.SubClass2();
		AClass.SubClass22 ob22=new AClass.SubClass22();
		ob2.m2(123);
		ob22.m22(124);
	}//end of main method
}//end of innerclass
