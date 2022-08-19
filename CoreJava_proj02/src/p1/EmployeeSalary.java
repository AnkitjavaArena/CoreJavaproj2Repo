package p1;

public class EmployeeSalary {
public float totSal;
public void calculate(int bSal) {
	totSal=bSal+(0.93F*bSal)+(0.63F*bSal);
}//end of method

public void getEmployeeSalary() {
	System.out.println("===employeeSalary===");
	System.out.println("TotSal::"+totSal);
}//end of method
}//end of class
