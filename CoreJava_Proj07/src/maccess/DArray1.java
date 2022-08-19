package maccess;

import java.util.Scanner;

import test.Employee;

public class DArray1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employee::");
		int n=Integer.parseInt(s.nextLine());
		Employee e[]=new Employee[n];
		               //Array holdin n employee objects
		System.out.println("Enter "+n+" Employee Details");
		
		for(int i=0;i<n;i++) {
			System.out.println("Ente rthe empId::");
			String eId=s.nextLine();
			System.out.println("Enter the EmpName::");
			String eName=s.nextLine();
			System.out.println("Enter the EmpDesg::");
			String eDesg=s.nextLine();
			System.out.println("Enter the BsAl::");
			int bSal=Integer.parseInt(s.nextLine());
			e[i]=new Employee(eId,eName,eDesg,bSal);
			
		}//end  of for loop
		
		System.out.println("===Display Employeee Details===");
		for(int i=0;i<n;i++) {
			System.out.println(e[i].toString());
		}//end of loop
		s.close();
	}//end of main method
}//end of class
