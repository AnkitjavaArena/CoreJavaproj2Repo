//WAP to read a string and display the sum of numbers in the string
//(without built in methods)

package maccess;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente rthe string::");
		String str=s.nextLine();
		int len=str.length();
		int sum=0;
		for(int i=0;i<=len-1;i++) {
			char ch=str.charAt(i);
			if((int)ch>=48&&(int)ch<=57) {
				int k=Integer.parseInt(String.valueOf(ch));
				sum=sum+k;
			}//end of if case
		}//end fo loop
		System.out.println("The sum of Numbers::"+sum);
		s.close();
	}//end of main method
}//end of class
