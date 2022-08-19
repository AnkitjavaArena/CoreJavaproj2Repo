package maccess;

public class PClass {

	public PClass(int a) {
		System.out.println("a: "+a);
	}
	public PClass(int a,int b) {
	this(a);    //SameClass_Con_call_with_1_para
	System.out.println("b::"+b);
	}
}//end of PClass
