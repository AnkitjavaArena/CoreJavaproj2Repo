package maccess;

import java.util.Scanner;

public class DString2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String 1::");
		String s1=s.nextLine().trim();
		System.out.println("Enter the String 2::");
		String s2=s.nextLine().trim();
		System.out.println("===equals()===");
		boolean z=s1.equalsIgnoreCase(s2);
		if(z) {
			System.out.println("Strings are equal...");
		}
		else {
			System.out.println("Strings are not equal...");
		}
		System.out.println("===CompareTo()===");
		int k=s1.compareToIgnoreCase(s2);
		if(k==0) {
			System.out.println("Strings are equal...");
		}
		else if(k>0)
			System.out.println("s1 is greater than s2");
		else
			System.out.println("s2 is greater than s1");
		s.close();
	}//end of main method
}//end of class
