package pack12;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks of sub 1::");
		int s1=Integer.parseInt(s.nextLine());
		System.out.println("Enter the marks of sub 2::");
		int s2=Integer.parseInt(s.nextLine());
		System.out.println("Enter the marks of sub 3::");
		int s3=Integer.parseInt(s.nextLine());
		System.out.println("Enter the marks of sub 4::");
		int s4=Integer.parseInt(s.nextLine());
		System.out.println("Enter the marks of sub 5::");
		int s5=Integer.parseInt(s.nextLine());
		System.out.println("Enter the marks of sub 6::");
		int s6=Integer.parseInt(s.nextLine());
		
		if((s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&(s3>=0&&s3<=100)&&(s4>=0&&s4<=100)
				&&(s5>=0&&s5<=100)&&(s6>=0&&s6<=100)) {
			int totMarks=s1+s2+s3+s4+s5+s6;
			StudentResult rs=new StudentResult();
			rs.calculate(totMarks);  //methodCall
		}//end of if
		else {
			System.out.println("Invalid marks....");
		}
		s.close();
	}//end of main method
}//end of class
