package test;

import java.util.Scanner;

import maccess.CClass;

public class DInheritance5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a::");
		CClass.a=s.nextInt();
		System.out.println("Enter the value of b::");
		CClass.b=s.nextInt();
		CClass.m1();
		CClass.m2();
		System.out.println("===Accessing with object reference===");
		CClass ob=new CClass();  //Empty_Object_reference is created
		ob.m1();
		ob.m2();
		s.close();
	}//end of main
}//end of class
