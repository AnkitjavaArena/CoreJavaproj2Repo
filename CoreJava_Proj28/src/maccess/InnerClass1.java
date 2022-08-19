package maccess;
import test.*;
public class InnerClass1 {
	public static void main(String[] args) {
		SubClass1 ob1=new SubClass1();   //outerclass object
		ob1.m1();
		SubClass1.SubClass3 ob3=new SubClass1.SubClass3();
									//static member innerClassobject
		ob3.m3();
		SubClass1.SubClass3.m33();
		
		SubClass1.SubClass2 ob2=ob1.new SubClass2();
		                          //non static member innerclass_object
		ob2.m2();
		SubClass1.SubClass2.m22();
		
	}//end of main method
}//end of class
