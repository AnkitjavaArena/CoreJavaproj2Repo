/*WAP to read bSal and calculate totSal
 * Note:: totSal=bSal+HRA+DA;
 * HRA=96% of bSal
 * DA=63% of bSal
 * 
 */


package pack10;

public class EmployeeSalary {
	float totSal;
	void calculate(int bSal) {
		totSal=bSal+(0.96F*bSal)+(0.63F*bSal);
		System.out.println("TotSal::"+totSal);
	}//end of method
}//end of class
