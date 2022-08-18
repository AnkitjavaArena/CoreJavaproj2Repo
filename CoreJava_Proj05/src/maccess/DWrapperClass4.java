//AutoUnboxing process

package maccess;

public class DWrapperClass4 {
	public static void main(String[] args) {
		//autoBoxing process
		Integer ob1=123;
		Double ob2=12.34;
		Character ob3='A';
		Boolean ob4=true;
		//Autounboxing process
		int i=ob1;
		Double d=ob2;
		char ch=ob3;
		boolean b=ob4;
		System.out.println("===Display values===");
		System.out.println("i::"+i);
		System.out.println("d::"+d);
		System.out.println("ch::"+ch);
		System.out.println("b::"+b);
		
	}//end of main
}//end of class
