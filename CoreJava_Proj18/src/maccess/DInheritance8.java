package maccess;

import java.util.Scanner;

import test.CClass;
import test.PClass;

public class DInheritance8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a::");
		int a=s.nextInt();
		System.out.println("Enter the value of b::");
		int b=s.nextInt();
		System.out.println("Enter the value of c::");
		int c=s.nextInt();
		System.out.println("Enter the value of d::");
		int d=s.nextInt();
		PClass.m(a);
		PClass.m(a,b);
		CClass.m(a,b,c);
		CClass.m(a,b,c,d);
		s.close();
	}//end of main
}//end of class
