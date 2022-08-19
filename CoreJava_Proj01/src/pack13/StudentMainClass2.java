package pack13;

import java.util.Scanner;

public class StudentMainClass2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1,totMarks=0;
		while(i<=6) {
			System.out.println("Enter the marks of Sub::"+i);
			int sub=Integer.parseInt(s.nextLine());
			i++;
			if(sub<0 || sub>100) {
				System.out.println("Invalid marks...");
				i--;
				continue;  //skip the below lines of loop from the execution
			}
			totMarks=totMarks+sub;
		}//end of while loop
		StudentResult rs=new StudentResult();
		rs.calculate(totMarks);  //methodCall
		s.close();
	}//end of main method
	
}//end of class
