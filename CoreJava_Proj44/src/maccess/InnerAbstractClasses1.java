package maccess;
import test.*;
//mport test.SubClass.AClass;
public class InnerAbstractClasses1 {
	public static void main(String[] args) {
		SubClass.AClass1 ob1=new SubClass.AClass1() {
			public void m1(int x) {
				System.out.println("x::"+x);
			}//end of method
		};//end of anonymous class
		ob1.m1(121);
		
		ITest.AClass2 ob2=new ITest.AClass2() {
			public void m2(int y) {
				System.out.println("y::"+y);
			}//end of method
		};//end of childclass
		ob2.m2(123);
		
		AClass.AClass3 ob3 = new AClass.AClass3() {
			public void m3(int z) {
				System.out.println("z::"+z);
			}//end of method
			};
			ob3.m3(124);
	}//end of main method
}//end of class
