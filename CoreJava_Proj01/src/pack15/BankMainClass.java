package pack15;

import java.util.Scanner;

//MAinClass
public class BankMainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true) {
				System.out.println("Enter the pinNo::");
				int pinNo=Integer.parseInt(s.nextLine());
				CheckPinNo cpn=new CheckPinNo();
				boolean z=cpn.verify(pinNo);
				if(z) {
					System.out.println("===Choice====");
					System.out.println("1.Withdraw\n2.Deposit\n");
					System.out.println("Enter the choice::");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice) {
					case 1:
						System.out.println("enter the amount::");
						int a1=Integer.parseInt(s.nextLine());
						if(a1>0&&a1%100==0) {
							if(a1<=5000) {
								WithDraw wd=new WithDraw();
								wd.wDraw(a1);
							}//end of if case
							else {
								System.out.println("Insufficient balance...");
							}
						}//end of if case
						else {
							System.out.println("Invalid amount....");
						}
							
						break xyz;  //stop the loop
					case 2:
						System.out.println("Enter amount::");
						int a2=Integer.parseInt(s.nextLine());
						if(a2>0&&a2%100==0) {
							Deposit dp=new Deposit();
							dp.deposit(a2);
						}//end of if case
						else {
							System.out.println("Invalid amount");
						}
						break xyz;
					default: System.out.println("Invalid choice....");
					break xyz;
					}//end of switch
					
				}//end of if
				else {
					System.out.println("Invalid PinNo:::");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry!!!Transaction blocked.....");
					break; //stop the loop
				}
			}//end of while loop
	}//end of main
}//end of class
