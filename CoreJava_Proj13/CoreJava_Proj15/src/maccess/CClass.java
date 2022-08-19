package maccess;

public class CClass extends PClass{
	public static int b;
	public static void m2() {
		System.out.println("===CCLass m2()===");
		System.out.println("b::"+b);
	}
	static {
		System.out.println("CClass static block...");
	}
}//end of class
