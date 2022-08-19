package test;

public class B extends A {
	public int b;
	public void m2() {
		System.out.println("===childClass m2()===");
		System.out.println("b::"+b);
	}//end of method
	{
		System.out.println("ChildClass Instance Block....");
	}//end of non static block
}//end of class
