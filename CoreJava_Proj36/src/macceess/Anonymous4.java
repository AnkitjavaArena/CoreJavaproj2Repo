package macceess;
import java.util.Scanner;

import test.*;
public class Anonymous4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true) {
				System.out.println("Enter teh pinNo::");
				int pinNo=Integer.parseInt(s.nextLine());
				CheckPinNo cpn=new CheckPinNo();
				boolean z=cpn.verify(pinNo);
				if(z) {
					System.out.println("===Choice====");
					System.out.println("1.Withdraw\n2.Deposit");
					System.out.println("Enter choice::");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice) {
					case 1:
						System.out.println("Enter the amount::");
						int a1=Integer.parseInt(s.nextLine());
						if(a1>0&& a1%100==0) {
							Transaction wd=new Transaction() 
							{
								public void process(int amt) {
									if(amt<=b.bal) {
										System.out.println("amt withdrawn::"+amt);
										b.bal=b.bal-amt;
										b.getBalance();
										System.out.println("Transaction successful!!!");
										
									}
									else {
										System.out.println("Insufficient fund.....");
									}
								}//end of method process()
							};//end of child class
							wd.process(a1);
						}//emd of of
						else {
							System.out.println("Invalid amount....");
						}
						break xyz; //stop the loop
						
					case 2:System.out.println("Enter the amount::");
						int a2=Integer.parseInt(s.nextLine());
						if(a2>0&&a2%100==0) {
							Transaction dp=new Transaction(){
								public void process(int amt) {
									System.out.println("Amt deposited::"+amt);
									b.bal=b.bal+amt;
									b.getBalance();
									System.out.println("Transaction completed...");
								}//end of method
							}; //end oof childclass
							dp.process(a2);
						}//end of if
						else
							System.out.println("Invalid amount!!!");
						break xyz;
						
					default:System.out.println("Invalid choice....");
					break xyz;  //stop the loop
					}//end of switch
				}//end of if case
				else {
					System.out.println("Invalid pinNo::");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry!!!Transactionn blocked...");
					break; //stop the loop
				}
			}//end of while loop
		
		s.close();
	}//end of main
}//end of class
