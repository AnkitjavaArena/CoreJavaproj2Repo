package maccess;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DException1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			
			System.out.println("ente rthe number of integer Objects::");
			int n=s.nextInt();
			Integer a[]=new Integer[n];   //Integer array
			System.out.println("Enter "+n+" Integer objects::");
			for(int i=0;i<n;i++) {
				a[i]=new Integer(s.nextInt());
			}//end of for loop
			System.out.println("===Display from Array===");
			for(int i=0;i<n;i++) {
				System.out.println(a[i].toString());
			}//end of for loop
		}//end of try 
		catch(InputMismatchException ime) {
			System.out.println("Enter only integer Value!!!");
		}//end of catch block
		
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("Check the index value of Array!!!");
		}//enf of catch block
		
		finally {
			s.close();
		}//end of finally block
	}//end of main method
}//end of class
