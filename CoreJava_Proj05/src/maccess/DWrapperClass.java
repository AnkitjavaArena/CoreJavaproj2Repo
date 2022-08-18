package maccess;

public class DWrapperClass {

	//@SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing process
		byte b=123;
		Byte ob1=new Byte(b);
		Byte ob2=new Byte("124");
		
		short s=234;
		Short ob3=new Short(s);
		Short ob4=new Short("345");
		
		Integer ob5=new Integer(1234);
		Integer ob6=new Integer("2345");
		
		Long ob7=new Long(12345678L);
		Long ob8=new Long("234567");
		
		
		Double ob9=new Double(23456.78);
		Double ob10=new Double("1234");
		
		Character ob11=new Character('A');
		
		Boolean ob12=new Boolean(true);
		Boolean ob13=new Boolean("false");
		
		//Float ob14=new Float(12.34f);
		//Float ob15=new Float(12.34);
		//Float ob16=new Float("12.34");
		System.out.println("===Display from WrapperClass Objects===");
		System.out.println("obj1::"+ob1.toString());
		System.out.println("obj2::"+ob2.toString());
		System.out.println("obj3::"+ob3.toString());
		System.out.println("obj4::"+ob4.toString());
		System.out.println("obj5::"+ob5.toString());
		System.out.println("obj6::"+ob6.toString());
		System.out.println("obj7::"+ob7.toString());
		System.out.println("obj8::"+ob8.toString());
		System.out.println("obj9::"+ob9.toString());
		System.out.println("obj10::"+ob10.toString());
		System.out.println("obj11::"+ob11.toString());
		System.out.println("obj12::"+ob12.toString());
		System.out.println("obj13::"+ob13.toString());
		
	}//end of main
}//end of class
