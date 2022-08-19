package maccess;
import test.*;
import java.util.Scanner;

public class Anonymous3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int value1::");
		int v1=Integer.parseInt(s.nextLine());
		System.out.println("Enter the int value2::");
		int v2=Integer.parseInt(s.nextLine());
		System.out.println("====Choice====");
		System.out.println("1.ADD\n2.sub\n3.mul\n4.div\n5.modDiv");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1:IArithmetic ad=new IArithmetic()
				{
					public double process(int x,int y) {
						return x+y;
					}
				};
				System.out.println("sum::"+ad.process(v1,v2));
			break;
		case 2:IArithmetic sb=new IArithmetic()
		{
			public double process(int x,int y) {
				return x-y;
			}
		};
		System.out.println("Difference::"+sb.process(v1,v2));
			break;
		case 3:IArithmetic mul=new IArithmetic()
		{
			public double process(int x,int y) {
				return x*y;
			}
		};
		System.out.println("product::"+mul.process(v1,v2));
			break;
		case 4:IArithmetic div=new IArithmetic()
		{
			public double process(int x,int y) {
				return (double)x/y;
			}
		};
		System.out.println("Quotient::"+div.process(v1,v2));
			break;
		case 5:IArithmetic mod=new IArithmetic()
		{
			public double process(int x,int y) {
				return x%y;
			}
		};
		System.out.println("remainder::"+mod.process(v1,v2));
			break;
		default:System.out.println("Invalid choice!!!");
		}//end of switch
		
	}//end of method
}//end of class
