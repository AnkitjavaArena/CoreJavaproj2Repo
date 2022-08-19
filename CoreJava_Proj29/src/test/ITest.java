package test;

public interface ITest {
	public static class SubClass2{
		public void m2(int x) {
			System.out.println("****m2()****");
			System.out.println("y::"+x);
		}//end of method
	}//end of static member innerclass
}//end of interface
