//WAP to check whether a String is palindrome or not

package maccess;

import java.util.Scanner;

public class DString6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String::");
		String s1=s.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(s1);
		sb.reverse();
		String s2=new String(sb);
		if(s1.equals(s2))
			System.out.println("Palindrome...");
		else
			System.out.println("Non-palindrome....");
		s.close();
	}//end of main
}//end of class
