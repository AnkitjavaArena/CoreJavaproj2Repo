package maccess;
import test.*;
import java.util.Scanner;

@SuppressWarnings("serial")
public class DException7 extends Exception{
	public DException7(String msg) {
		super(msg);
	}//end of cons
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter stuName::");
			String stuName=s.nextLine();
			System.out.println("Enter stuBranch::");
			String stuBranch=s.nextLine().toUpperCase();
			CheckBranch cb=new CheckBranch();
					//con_call with 0-para
			cb.verify(stuBranch);  //methodCall
			System.out.println("Enter the RolNo::");
			String rollNo=s.nextLine();
			if(rollNo.length()!=10) {
				//raise the exception
				DException7 ob=new DException7("Invalid rollNo!!!");
				throw ob;
			}//end of if case
			System.out.println("stuName::"+stuName);
			System.out.println("stuBranch::"+stuBranch);
			System.out.println("rollNo::"+rollNo);
		}//end of try
		catch(DException7 ob) {
			System.out.println(ob.getMessage());
		}//end of catch
		catch(CheckBranch cb) {
			System.out.println("Invalid Branch!!!!");
		}//end of catch block
		finally {
			s.close();
		}//end of finally block
		
	}//end of main method
}//end of class
