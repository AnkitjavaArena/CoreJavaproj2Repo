package maccess;
import java.util.Scanner;
public class DException4 extends Exception   //step-1
{
	public DException4(String msg) {
	super(msg);	
	}//end of cons
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try  //step-2 
		{
			System.out.println("Enter the value of x(person)::");
			int x=Integer.parseInt(s.nextLine());
			if(x<=0) //raise the exceptionm step-3
			{
				DException4 ob=new DException4("Enter only nonZero +ve value");  //step-4 con_call
				throw ob;  //step-5
			}//end of if case
			int k=10/x; //exception of x=0
			System.out.println("Each person will get "+k+" hours...");
		}//end fo try block
		catch(DException4 ob) {
			ob.printStackTrace();
			//System.out.println(ob.getMessage());
		}//end of catch block
		catch(NumberFormatException nfe) {
			System.out.println("Enter only Integer value.....");
		}
		finally {
			s.close();
		}
	}//end of main method
	
}//end of class
