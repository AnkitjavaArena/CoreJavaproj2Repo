package maccess;

import test.ITest;

public class Anonymous5 {
	public static void main(String[] args) {
		System.out.println("===Lambda Expression===");
		ITest ob2=(int x)->{
			System.out.println("***m1()*********");
			System.out.println("The value x::"+x);
		};//end of lambda
		ob2.m1(121);
	}//end of main method
}//end of class
