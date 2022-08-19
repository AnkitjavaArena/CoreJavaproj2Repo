package maccess;

import java.util.Scanner;

import test.B;

public class DInheritance{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		B ob=new B();   //inheritance process
		System.out.println("Enter the value of a::");
		ob.a=s.nextInt();
		System.out.println("Enter the value of b::");
		ob.b=s.nextInt();
		ob.m1();
		ob.m2();
		s.close();
	}//end of main
}//end of class
