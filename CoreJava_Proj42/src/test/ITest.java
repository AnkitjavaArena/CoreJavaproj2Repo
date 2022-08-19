package test;

public interface ITest {
	private void p1(int x) {
		System.out.println("*********Private method p1(x)*******");
		System.out.println("x::"+x);
	}//end of private method
	private static void p2(int y) {
		System.out.println("****Private method p2()******");
		System.out.println("y::"+y);
	}//end of static method in interface
	default void dis1(int x,int y) {
		this.p1(x);  //instance_method_call
		ITest.p2(y);   //static _method_call
	}//end of method
	static void dis2(ITest ob,int x,int y) {
		ob.p1(x);      //Instance_method_call
		ITest.p2(y);   //static_method_call
	}
	public abstract void m(int z);
}//end of interface
