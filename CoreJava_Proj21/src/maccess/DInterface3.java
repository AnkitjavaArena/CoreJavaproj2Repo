package maccess;

import java.util.Scanner;

import test.*;

public class DInterface3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int value1::");
		int v1=Integer.parseInt(s.nextLine());
		System.out.println("Enter the int value2::");
		int v2=Integer.parseInt(s.nextLine());
		System.out.println("===Choice===");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\nModDiv");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1:
			Addition ad=new Addition();
			System.out.println("Sum::"+ad.process(v1,v2));
			break;
		case 2:
			Subtraction sb=new Subtraction();
			System.out.println("Difference::"+sb.process(v1,v2));
			break;
		case 3:
			Multiplication md=new Multiplication();
			System.out.println("Product::"+md.process(v1,v2));
			break;
		case 4:
			Division dv=new Division();
			System.out.println("Quotient::"+dv.process(v1,v2));
			break;
		case 5:
			ModDivision mod=new ModDivision();
			System.out.println("Remainder::"+mod.process(v1,v2));
			break;
		default: System.out.println("Invalid choice!!!!");
		}//end od switch
		s.close();
		
	}//end of main method
}//end of class
