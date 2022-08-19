package test;

public class PClass {
	public static void m(int a,int b) {
		System.out.println("===PClass m(int,int");
		System.out.println("a::"+a);
		System.out.println("b::"+b);
	}//end of method
	static public void m(int a) {
		System.out.println("===PCLass m(int)===");
		System.out.println("a: "+a);
	}//end of method
}//end of class
