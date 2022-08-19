//WAp to reverse a string
package maccess;

import java.util.Scanner;

public class DString3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String::");
		String s1=s.nextLine();
		int len=s1.length();
		System.out.println("s1::"+s1.toString());
		System.out.println(":Length of s1::"+len);
		System.out.println("===String reverse===");
		for(int i=len-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		s.close();
		
	}//end of main method
}//end of class
