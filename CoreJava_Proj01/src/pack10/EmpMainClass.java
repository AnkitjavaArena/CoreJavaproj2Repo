//mainclass
package pack10;
import java.util.Scanner;

public class EmpMainClass {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the bSal(bsal>=5000)::");
	int bS=Integer.parseInt(s.nextLine());
	if(bS>=5000) {
		EmployeeSalary es=new EmployeeSalary();
		es.calculate(bS); //method call
	}//end of if
	else {
		System.out.println("Invalid bSal....");
	}
	s.close();
	}//end of main method
}//end of class
