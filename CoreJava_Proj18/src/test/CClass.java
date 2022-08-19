package test;

public class CClass extends PClass{
	public static void m(int a,int b,int c,int d) {
		System.out.println("===CClass m(int,int,int,int)===");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}//end of method
	public static void m(int a,int b,int c) {
		System.out.println("===CClass m===(int,int,int)=== ");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
}//end of class
