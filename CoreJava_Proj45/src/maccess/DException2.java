//Handling multiple catch blocks

package maccess;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DException2 {
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
		catch(InputMismatchException|ArrayIndexOutOfBoundsException aib) {
			System.out.println("Enter only integer Value!!!/Check the index of array!!");
		}//end of catch blockArrayIndexOutOfBoundsException aib
		finally {
			s.close();
		}//end of finally block
	}//end of main method
}//end of class
