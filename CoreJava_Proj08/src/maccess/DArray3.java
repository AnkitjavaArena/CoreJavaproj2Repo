//WAP to read and display String objects

package maccess;

import java.util.Scanner;

public class DArray3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of String objects::");
		int n=Integer.parseInt(s.nextLine());
		String str[]=new String[n];
						//Array holding n String objects
		System.out.println("Enter "+n+" String objects::");
		for(int i=0;i<n;i++) {
			str[i]=new String(s.nextLine());
		}//end of loop
		
		System.out.println("===Display String Objects===");
		for(int i=0;i<n;i++) {
			System.out.println(str[i].toString());
		}
		s.close();
	}//end of main method
}//end of class
