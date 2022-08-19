/*WAP to read and display Integer Wrapper class objects
 * 
 */


package maccess;

import java.util.Scanner;

public class DArray2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of integer objects::");
		int n=Integer.parseInt(s.nextLine());
		Integer a[]=new Integer[n];
						//Array holding n integer objects
		System.out.println("Enter "+n+" Integer objects::");
		for(int i=0;i<n;i++) {
			a[i]=new Integer(s.nextLine());
		}//end of for loop
		System.out.println("===Display Integer objects===");
		for(int i=0;i<n;i++) {
			System.out.println(a[i].toString());
		}//end of loop
		s.close();
	}//end of main method
}//end of class
