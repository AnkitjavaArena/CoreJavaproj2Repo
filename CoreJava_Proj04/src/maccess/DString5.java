package maccess;

import java.util.Scanner;

public class DString5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String::");
		String str=s.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			switch(ch) {
			case 'a':
			case 'A':count++;
				break;
			case 'e':
			case 'E':count++;
				break;
			case 'i':
			case 'I':count++;
				break;
			case 'O':
			case 'o':count++;
				break;
			case 'U':
			case 'u':count++;
				break;
			}//end of switch
		}//end of for loop
		System.out.println("No. of Vowels::"+count);
	}//end of main
}//end of class
