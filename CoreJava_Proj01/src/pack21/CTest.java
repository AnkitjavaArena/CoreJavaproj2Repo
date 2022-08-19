package pack21;
//subClass
public class CTest {

	CTest(){
		System.out.println("===0-param constructor===");
	}//end of constructor
	
	CTest(int x){
		System.out.println("===1-param con===");
		System.out.println("x::"+x);
	}//end of cons.
	
	CTest(int x,int y){
		System.out.println("===2-param con===");
		System.out.println("x::"+x);
		System.out.println("y::"+y);
	}//end of cons.
}//end of class
