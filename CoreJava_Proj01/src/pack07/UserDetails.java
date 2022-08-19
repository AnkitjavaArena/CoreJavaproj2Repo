/*WAP to read and display user details
 * userName,mailId,phoneNo
 */


package pack07;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);    //Scanner object conectd to OS_Buffer
	System.out.println("Enter the user name::");
	String userName=s.nextLine();
	System.out.println("Enter the mailId::");
	String mailId=s.nextLine();
	System.out.println("Enter the phoneNo::");
	long phNo=s.nextLong();
	System.out.println("===UserDetails===");
	System.out.println("UserName::"+userName);
	System.out.println("MailId::"+mailId);
	System.out.println("Phone No::"+phNo);
	
	//closing the scanner object
	s.close();
	}//end of main
}//end of class
