package maccess;

public class Cclass extends Pclass{
	public void m(int a,int b,int c,int d) {
		this.m(a,b,c);   //SameClass method call with 3 parameter
		System.out.println("d::"+d);
	}
	public void m(int a,int b,int c) {
		super.m(a,b); //Pclass method call with 2 parameter
		System.out.println("c: "+c);
	}
}//end of class
