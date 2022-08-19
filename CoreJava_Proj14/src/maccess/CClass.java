package maccess;

public class CClass extends PClass{
	public CClass(int a,int b,int c,int d) {
		this(a,b,c);   //Sameclass con_call_withn 3 parameter
		System.out.println("d::"+d);
	}
	public CClass(int a,int b,int c) {
		super(a,b);
		System.out.println("c::"+c);
	}//end of cons
	
	
}//End of class
