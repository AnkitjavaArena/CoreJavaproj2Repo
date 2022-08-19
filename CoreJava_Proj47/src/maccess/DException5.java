package maccess;
import java.util.Scanner;

import test.CheckBranch;
@SuppressWarnings("serial")
public class DException5 extends Exception{
	public DException5(String msg) {
		super(msg);
	}//end of cons
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the stuName::");
			String stuName=s.nextLine();
			System.out.println("Enter the stuBranch::");
			String stuBranch=s.nextLine().toUpperCase();
			CheckBranch cb=new CheckBranch();
			boolean k=cb.verify(stuBranch);
			if(!k)//raise the exception
			{
				DException5 ob=new DException5("Invalid branch!!!");
				throw ob;
			}//end of if
			System.out.println("Enter the rollNo::");
			String rollNo=s.nextLine();
			if(rollNo.length()!=10) {//raise teh exception
				DException5 ob=new DException5("Invalid rollNo....");
				throw ob;
			}//end of if
			System.out.println("StuName::"+stuName);
			System.out.println("StuBranch::"+stuBranch);
			System.out.println("RollNo::"+rollNo);
		}//end of try
		catch(DException5 ob) {
			System.out.println(ob.getMessage());
		}//end of catch
		finally {
			s.close();
		}//end of finnaly block
	}//end of main method
}//end of class
