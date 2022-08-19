package maccess;

public class PClass {
	public static int a;
	public static void m1() {
		System.out.println("===PClass m1()===");
		System.out.println("The value a::"+a);
	}
	static {
		System.out.println("PClass Static block...");
	}
}//end of class
