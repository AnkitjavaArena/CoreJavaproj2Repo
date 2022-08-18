package maccess;

public class DWrapperClass3 {
	public static void main(String[] args) {
		//Boxing process
		Integer ob1=new Integer(123);
		Double ob2=new Double(12.34);
		Character ob3=new Character('A');
		Boolean ob4=new Boolean(true);
		//unboxing process
		int i=ob1.intValue();
		double d=ob2.doubleValue();
		char ch=ob3.charValue();
		boolean b=ob4.booleanValue();
		System.out.println("===Display Values===");
		System.out.println("i::"+i);
		System.out.println("d::"+d);
		System.out.println("ch::"+ch);
		System.out.println("b::"+b);
	}//end of main method
}//end of class
