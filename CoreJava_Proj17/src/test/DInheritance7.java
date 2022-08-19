package test;

import java.util.Scanner;

import maccess.Cclass;

public class DInheritance7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a::");
		int a=s.nextInt();
		System.out.println("Enter the value of b::");
		int b=s.nextInt();
		System.out.println("Enter the value of c::");
		int c=s.nextInt();
		System.out.println("Ente the value of d::");
		int d=s.nextInt();
		Cclass ob=new Cclass();   //Con_call
		ob.m(a,b,c,d);  //Method_call_4_para
		s.close();
	}//end of main method
}//end of class
