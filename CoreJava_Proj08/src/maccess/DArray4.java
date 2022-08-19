//Object array

package maccess;

public class DArray4 {
	public static void main(String[] args) {
		Object o[]=new Object[3];
		o[0]=new Integer(121);
		o[1]=new String("NIT");
		o[2]=new Employee("A101","Raj","SE",12000);
		
		System.out.println("===Display from object array===");
		for(int i=0;i<3;i++) {
			System.out.println(o[i].toString());
		}//end of for loop
	}//end of main method
}//end of class
