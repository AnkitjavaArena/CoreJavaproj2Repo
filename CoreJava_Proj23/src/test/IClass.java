package test;

public class IClass implements ITest2{
	public void m1(int x) {
		System.out.println("===ITest m1()===");
		System.out.println("a::"+a);
		System.out.println("x::"+x);
	}//end of method
	public void m2(int y) {
		System.out.println("====ITest m2()====");
		System.out.println("b::"+b);
		System.out.println("y::"+y);
		
	}//end of method
}//end of class
