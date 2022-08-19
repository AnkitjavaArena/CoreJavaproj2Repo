package test;

public class SubClass1 {
	public int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("***Outerclass m1()******");
		System.out.println("a::"+a);
		System.out.println("b::"+b);
		class SubClass4{
			public void m4() {
				System.out.println("***LocalinnerClass Nonstatic m4()****");
				System.out.println("a::"+a);
				System.out.println("b::"+b);
			}//end of method
			public static void m44() {
				System.out.println("***LocalInnerclass static m44()****");
				//System.out.println("a::"+a);//compilation eror
				System.out.println("b::"+b);
			}//end of method
		}//end of local inner class subclass4
		SubClass4 ob4=new SubClass4();   //locaL INNERCLASS object
		ob4.m4();
		SubClass4.m44();
	}//end of m1() outerclass  method
	
	public class SubClass2{
		public void m2() {
			System.out.println("****nonstatic Innerclass Nonstatic m2()****");
			System.out.println("a:::"+a);
			System.out.println("b::"+b);
		}//end of method
		
		public static void m22() {
		System.out.println("***Nonstatic member InnerClass Static m2()****");
		//System.out.println("a::"+a);  //compilation errro
		System.out.println("b::"+b);
		}//end of method
	}//end of nonstatic member inner class
	
	public static class SubClass3{
		public void m3() {
			System.out.println("***Static member Innerclass NonStatic m3()****");
			//System.out.println("a::"+a); //compilation error
			System.out.println("b::"+b);
		}//end of method
		public static void m33() {
			System.out.println("***Static member Innerclass Static m33()***");
			//System.out.println("a::"+a);
			System.out.println("b::"+b);
		}//end of method
	}//end of static member innerclass
}//end of Outer class
