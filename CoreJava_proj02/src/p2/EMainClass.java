package p2;

import java.util.Scanner;

import p1.EmployeeSalary;

public class EMainClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeSalary es=new EmployeeSalary();
		System.out.println("Enter the bSal::");
				System.out.println("Enter the bSal::");
		int bSal=s.nextInt();
		es.calculate(bSal);
		es.getEmployeeSalary();
		s.close();
	}//end of main method
}//end of class
