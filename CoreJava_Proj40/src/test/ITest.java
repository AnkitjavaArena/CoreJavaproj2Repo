package test;

public interface ITest {
	public static void m1(int x) {
		System.out.println("********Static meethod* m1(x)*********");
		System.out.println("x::"+x);
	}//end of static method in interface
	public abstract void m2(int y);
}//end of inetrface
