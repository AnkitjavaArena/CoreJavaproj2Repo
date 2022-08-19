package maccess;
import java.util.Scanner;
public class DException3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("enter the value of x(persons)::");
			int x=Integer.parseInt(s.nextLine());
			int k=10/x;   //exception if x=0
			System.out.println("Each person will get "+k+" hours");
		}//end of try
		catch(ArithmeticException|NumberFormatException ob) {
			System.out.println("Enter only non-zero Integer value.... ");
		}//end of catch block
		finally {
			s.close();
		}//end of finally block
	}//end of main method
}//end of class
