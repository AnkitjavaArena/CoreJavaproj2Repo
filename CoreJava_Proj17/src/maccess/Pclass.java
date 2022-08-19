package maccess;

public class Pclass {
	public void m(int a,int b) {
		this.m(a); //SameClass_methodcall with 1 parameter
		System.out.println("b::"+b);
	}
	public void m(int a) {
		System.out.println("a::"+a);
	}
}//end of class
