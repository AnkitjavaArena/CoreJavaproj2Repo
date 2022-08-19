//Wap to read a string and display the reverse of words in the string 

package maccess;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DString7 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string::");
	String str=s.nextLine();
	System.out.println("===before reverse===");
	System.out.println(str);
	System.out.println("===After reverse===");
	StringTokenizer st=new StringTokenizer(str," ");
	while(st.hasMoreTokens()) {
		String tk=st.nextToken();
		StringBuffer sb=new StringBuffer(tk);
		System.out.print(sb.reverse()+" ");
	}//end of while loop
	s.close();
}//end of main class
}//end of class
