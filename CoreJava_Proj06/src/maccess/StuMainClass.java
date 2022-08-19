package maccess;

import java.util.Scanner;

import test.BranchCheck;
import test.RollNoValidation;
import test.StudentResult;

public class StuMainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter StuName::");
		String stuName=s.nextLine();
		System.out.println("Enter StudentBranch::");
		String branch=s.nextLine().toUpperCase();
		BranchCheck bc=new BranchCheck();
		boolean k=bc.verify(branch);
		
		if(k) {
			System.out.println("Enter the rollNo::");
			String rollNo=s.nextLine();
			if(rollNo.length()==10) {
				String code=rollNo.substring(6,8);
				RollNoValidation rnv=new RollNoValidation();
				boolean z=rnv.verify(branch,code);
				if(z) {
					System.out.println("*****ente r6 subject marks::");
					int i=1,totMarks=0;
					boolean b=false;
					
					while(i<=6) {
						System.out.println("Enter the marks of sub::"+i);
						int sub=Integer.parseInt(s.nextLine());
						i++;
						if(sub<0||sub>100) {
							System.out.println("Invalid mark!!!");
							i--;
							continue;//skip the below lines of code
						}
						if(sub>=0&&sub<=34)
							b=true;
						totMarks=totMarks+sub;
					}//end of while
					System.out.println("Name::"+stuName);
					System.out.println("Branch::"+branch);
					System.out.println("TotMarks::"+totMarks);
					StudentResult rs=new StudentResult();
					rs.calculate(totMarks,b);//methodCall
				}//end of if
				else {
					System.out.println("RollNo not validated with branch!!!");
				}
				
			}//end of if
			else {
				System.out.println("Invalid rollNo!!!!");
			}
		}//end of  if
		else {
			System.out.println("Invalid branch!!!!");
		}
		s.close();
		
	}//end of main
}//end of class
