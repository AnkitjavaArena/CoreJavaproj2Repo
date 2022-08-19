package pack11;

import java.util.Scanner;

public class ArithmeticMainClass {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int value1::");
		int v1=Integer.parseInt(s.nextLine());
		System.out.println("Enter the int value2::");
		int v2=Integer.parseInt(s.nextLine());
		System.out.println("===Choice===");
		System.out.println("1.Add\n2.Sub\n3.mul\n4.div\n5.modDiv");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1:
			Addition ad=new Addition();
			System.out.println("Sum::"+ad.add(v1,v2));
			break;
		case 2:
			Subtraction sb=new Subtraction();
			System.out.println("Subtraction::"+sb.sub(v1,v2));
			break;
		case 3:
			Multiplication ml=new Multiplication();
			System.out.println("Mul::"+ml.mul(v1,v2));
			break;
		case 4:
			Division dv=new Division();
			System.out.println("Division::"+dv.div(v1,v2));
			break;
		case 5:
			ModDivision md=new ModDivision();
			System.out.println("ModDiv::"+md.modDiv(v1,v2));
			break;
		default:
			System.out.println("Invalid Choice...");
		}//end of switch
		s.close();
	}//end of main method

	}//end of class
