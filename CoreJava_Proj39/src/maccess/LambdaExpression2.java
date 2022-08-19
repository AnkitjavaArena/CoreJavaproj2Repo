package maccess;
import java.util.Scanner;

import test.IArithmetic;
public class LambdaExpression2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value1::");
		int v1=Integer.parseInt(s.nextLine());

		System.out.println("Enter the value2::");
		int v2=Integer.parseInt(s.nextLine());
		
		System.out.println("===choice===");
		System.out.println("1.Add\n2.Sub\n3.Multiply\n4.Divide\n5.ModDivision");
		int choice=Integer.parseInt(s.nextLine());
		
		switch(choice) {
		case 1:
			IArithmetic ad=(int x,int y)-> {
				return x+y;
			//end of method
		};
			System.out.println("Sum::"+ad.process(v1,v2));
			break;
		case 2:
			IArithmetic sub=(int x,int y)-> {
				return x-y;
			//end of method
		};
			System.out.println("Difference::"+sub.process(v1,v2));
			break;
		case 3:
			IArithmetic mul=(int x,int y)-> {
					return x*y;
				//end of method
			};
			System.out.println("Product::"+mul.process(v1,v2));
			break;
		case 4:
			IArithmetic div=(int x,int y)-> {
				return x/y;
			//end of method
		};
			System.out.println("Divide::"+div.process(v1,v2));
			break;
		case 5:
			IArithmetic md=(int x,int y)-> {
				return x%y;
			//end of method
		};
			System.out.println("Remainder::"+md.process(v1,v2));
			break;
		default: System.out.println("Wrong choice!!!");
		}//end of switch case		
		s.close();
	}//end of main method
}//end of class
