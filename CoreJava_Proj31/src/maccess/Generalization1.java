package maccess;
import test.*;
public class Generalization1 {
	public static void main(String[] args) {
		System.out.println("===normal Inheritance====");
		CClass ob1=new CClass();
		ob1.m1(11);
		ob1.m2(12);
		ob1.m3(13);
		
		System.out.println("====Generalization process=====");
		PClass ob2=new CClass();
		ob2.m1(121);
		ob2.m2(122);
		//ob2.m3(123);
	}//end of main
}//end of class
