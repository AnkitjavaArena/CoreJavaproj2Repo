package maccess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DException9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
			System.out.println("Enter the marks of english::");
			int sub=s.nextInt();
			System.out.println("marks of english::"+sub);
			}//end of try blockk
			catch(InputMismatchException ime) {
				System.out.println("Enter only integer value....");
			}//end of catch block
		}//end of try-with-resource blcok
		
	}//end of main method
}//end of class
