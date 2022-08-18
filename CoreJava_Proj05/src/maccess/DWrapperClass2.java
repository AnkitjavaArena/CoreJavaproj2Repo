//autoboxing
package maccess;

public class DWrapperClass2 {
	public static void main(String[] args) {
		//AutoboxingProcess
		byte b=123;
		Byte ob1=b;
		
		short s=234;
		Short ob2=s;
		
		Integer ob3=123;
		
		Long ob4=1234567L;
		
		//Float ob5=12.34F;
		
		Double ob6=23456.78;
		
		Character ob7='A';
		
		Boolean ob8=true;
		
		System.out.println("===Display from WrapperClass object===");
		System.out.println("ob1::"+ob1.toString());
		System.out.println("ob2::"+ob2.toString());
		System.out.println("ob3::"+ob3.toString());
		System.out.println("ob4::"+ob4.toString());
		//System.out.println("ob5::"+ob5.toString());
		System.out.println("ob6::"+ob6.toString());
		System.out.println("ob7::"+ob7.toString());
		System.out.println("ob8::"+ob8.toString());
		
		
		
	}//end of main method
}//end  of class

