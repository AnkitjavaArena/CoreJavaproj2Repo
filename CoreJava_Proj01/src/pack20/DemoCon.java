package pack20;

import java.util.Scanner;

//mainClass
public class DemoCon {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the userName::");
		String uN=s.nextLine();
		System.out.println("Enter MailId::");
		String mId=s.nextLine();
		System.out.println("Enter the phoneNo::");
		long phNo=s.nextLong();
		
		User u=new User(uN,mId,phNo);
		u.getUser();
		
		s.close();
	}//end of main
}//end of class
