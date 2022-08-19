/* WAP to enter userDetails
 * user Name,MailId,phoneNumber,city
 */

package pack08;

import java.util.Scanner;

public class UserDetails1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter UserName::");
		String userName=s.nextLine();
		System.out.println("Enter MailId::");
		String mailId=s.nextLine();
		System.out.println("Enter PhoneNo::");
		long phNo=Long.parseLong(s.nextLine());
		System.out.println("Enter City::");
		String city=s.nextLine();
		
		System.out.println("===UserDetails===");
		System.out.println("UserName::"+userName);
		System.out.println("MailId::"+mailId);
		System.out.println("PhoneNo::"+phNo);
		System.out.println("City::"+city);
	}//end of main method
}//end of class
