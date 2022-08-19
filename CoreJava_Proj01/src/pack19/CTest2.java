package pack19;

public class CTest2 {
	{
		System.out.println("===Instance block===");
	}//end of  instance block
	
	static {
		System.out.println("===static block===");
	}//end of static block
	
	CTest2(){
		System.out.println("===Constructor Ctest2()===");
	}//end of constructor
	
	void dis() {
		System.out.println("===Instance method dis()===");
	}//end of instance method

}//end of class
