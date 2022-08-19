package maccess;
import test.*;
import java.util.Scanner;

public class Anonymous3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value1::");
		int v1=Integer.parseInt(s.nextLine());
		System.out.println("enter the value2::");
		int v2=Integer.parseInt(s.nextLine());
		System.out.println("===choice===");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\n.5modDiv");
		int choice =Integer.parseInt(s.nextLine());
		
		switch(choice) {
		case 1:
			IArithmetic ad=new IArithmetic() {
				public double process(int x,int y) {
					return x+y;
				}//end of method
			};
			System.out.println("Sum::"+ad.process(v1,v2));
			break;
		case 2:
			IArithmetic sub=new IArithmetic() {
				public double process(int x,int y) {
					return x-y;
				}//end of method
			};
			System.out.println("Difference::"+sub.process(v1,v2));
			break;
		case 3:
			IArithmetic mul=new IArithmetic() {
				public double process(int x,int y) {
					return x*y;
				}//end of method
			};
			System.out.println("Product::"+mul.process(v1,v2));
			break;
		case 4:
			IArithmetic div=new IArithmetic() {
				public double process(int x,int y) {
					return x/y;
				}//end of method
			};
			System.out.println("Divide::"+div.process(v1,v2));
			break;
		case 5:
			IArithmetic md=new IArithmetic() {
				public double process(int x,int y) {
					return x%y;
				}//end of method
			};
			System.out.println("Remainder::"+md.process(v1,v2));
			break;
		default: System.out.println("Wrong choice!!!");
		}//end of switch case
		s.close();
	}//end of main method
}//end of class
