package test;

public interface ITest {
	default void m1(int x) {
		System.out.println("****Default method m1(x)**********");
		System.out.println("x::"+x);
	}//end of default method in interface
	public abstract void m2(int y);
}//end of interface
