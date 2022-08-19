package pack06;

public class DemoVariables {

	int a;  //instance variable memory within the object
	static int b;//memory within the object
	void m1() {
		System.out.println("===instance method m1()===");
		System.out.println("The value a::"+a);
		System.out.println("The value b::"+b);
	}//end of instance method

	static void m2() {
		System.out.println("===static method m2()===");
		//System.out.println("The value a::"+a);  //Compilation error
		System.out.println("The value b::"+b);
	}//end of static method
	
	public static void main(String[] args) {
		DemoVariables dv= new DemoVariables();
		dv.a=12;
		DemoVariables.b=13;
		DemoVariables.m2();
		dv.m1();
	}//end of main method
	
}//end of class
