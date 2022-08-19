package pack14;

import java.util.Scanner;

public class StudentBranchMainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the student beranch::");
		String br=s.nextLine().toUpperCase();
		CheckBranch cb=new CheckBranch();
		boolean p=cb.verify(br);
		if(p) {
			System.out.println("Enter the rollNo::");
			String rollNo=s.nextLine();
			if(rollNo.length()==10) {
				System.out.println("Branch::"+br);
				System.out.println("RollNo::"+rollNo);
			}//end  of if
			else {
				System.out.println("Invalid rollNo....");
			}
		}//end of if
		else {
			System.out.println("Invalid branch...");
		}
	}//end of main
}//end of class
