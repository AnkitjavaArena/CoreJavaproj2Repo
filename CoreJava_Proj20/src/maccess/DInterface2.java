package maccess;
import java.util.Scanner;

import test.*;
public class DInterface2 {
	public static void main(String[] args) {
		//IComparable ob=new IComparable(); //Compilation_Error
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x::");
		int x=s.nextInt();
		System.out.println("Enter the value of y::");
		int y=s.nextInt();
		System.out.println("===Choice====");
		System.out.println("\n1.Greater\n2.Smaller");
		System.out.println("Enter the choice::");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			Greater gt=new Greater();
			gt.compare(x,y);
			break;
		case 2:Smaller sm= new Smaller();
		sm.compare(x,y);
			break;
		default:System.out.println("Invalid choice....");
		}//end of switch
		s.close();
	}//end of main
}//end of class
