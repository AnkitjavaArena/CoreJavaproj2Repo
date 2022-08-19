package maccess;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DTokenizer {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String::");
	String str=s.nextLine();
	StringTokenizer st=new StringTokenizer(str,"a");
	System.out.println("===display Tokens===");
	while(st.hasMoreTokens()) {
		String tk=st.nextToken();
		System.out.println(tk);
	}//end of while loop
	s.close();
	}//end of main
}//end of class
