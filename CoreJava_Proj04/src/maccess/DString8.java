/* WAP to read a string and dispaly the sum of numbers in the string
 * i/p: java7 by 2021
 * o/p: sum=1+7+2+0+2+1=13
 */


package maccess;

import java.util.Scanner;

public class DString8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String str=s.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				int k=Character.getNumericValue(str.charAt(i));
				sum=sum+k;
			}
		}//end of for loop
		System.out.println("Sum::"+sum);
		s.close();
	}//end of main
}//end of class
