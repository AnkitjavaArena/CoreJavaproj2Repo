//WAp to read employee address details

package pack09;

import java.util.Scanner;

public class EmpAddressDetails {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the empId::");
	String empId=s.nextLine();
	System.out.println("Enter the EmpName::");
	String empName=s.nextLine();
	System.out.println("Enter the Employee Designation::");
	String empDesg=s.nextLine();
	System.out.println("Enter the employee Salary::");
	int empSal=Integer.parseInt(s.nextLine());
	System.out.println("Enter the HNo::");
	String hNo=s.nextLine();
	System.out.println("Enter the streetName::");
	String sName=s.nextLine();
	System.out.println("Enter the city::");
	String city=s.nextLine();
	System.out.println("Enter the pinCode::");
	int pinCode=Integer.parseInt(s.nextLine());
	System.out.println("Enter thee mailId::");
	String mailId=s.nextLine();
	System.out.println("Enter the Phoneno::");
	long phNo=Long.parseLong(s.nextLine());
	
	System.out.println("===EmpAddressDetails===");
	System.out.println("EmpId::"+empId);
	System.out.println("EmpName:"+empName);
	System.out.println("EmpDesg::"+empDesg);
	System.out.println("EmpSal::"+empSal);
	System.out.println("HNO::"+hNo);
	System.out.println("sName::"+sName);
	System.out.println("City::"+city);
	System.out.println("pinCode::"+pinCode);
	System.out.println("MailId::"+mailId);
	System.out.println("PhNo::"+phNo);
	
	//close the connection
	s.close();
	}//end of main
}//end of class
