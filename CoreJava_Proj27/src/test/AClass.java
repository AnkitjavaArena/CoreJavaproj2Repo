package test;

public abstract class AClass {
	public void m1(int x) {
		System.out.println("===m1()===");
		System.out.println("the value of x::"+x);
	}//end of method
	
	public abstract void m2(int y);
}//end of class
