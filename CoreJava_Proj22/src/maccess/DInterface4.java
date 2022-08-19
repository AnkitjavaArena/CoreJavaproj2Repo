package maccess;
import test.*;
import java.util.Scanner;

public interface DInterface4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true) {
				System.out.println("Ente rthe pinNo::");
				int pinNo=Integer.parseInt(s.nextLine());
				CheckPinNo cpn=new CheckPinNo();
				boolean z=cpn.verify(pinNo);
				if(z) {
					System.out.println("====choice====");
					System.out.println("1.withdraw\n2.Deposit");
					System.out.println("Enter the choice::");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice) {
					case 1:
						System.out.println("Ente rthe amt::");
						int a1=Integer.parseInt(s.nextLine());
						if(a1>0&&a1%100==0) {
							WithDraw wd=new WithDraw();
							wd.process(a1);
						}
						else {
							System.out.println("Invalid amount....");
						}
						break xyz; //stop the loop
					
					case 2:
						System.out.println("enter the amount::");
						int a2=Integer.parseInt(s.nextLine());
						if(a2>0&&a2%100==0) {
							Deposit dp=new Deposit();
							dp.process(a2);
						}//end of if 
						else {
							System.out.println("Invalid amount....");
						}
						break xyz; //break the loop
							
					default: System.out.println("Invalid choice....");
					break xyz;   //stop the loop
							
					}//end of switch
				}//end of if
				else {
					System.out.println("Invlaid pinNo...");
					count++;
				}//end of esle block
				if(count==3) {
					System.out.println("Transaction blocked....");
					break; //stop the loop
				}
			}//end of while loop
	}//end of main method
}//end of interface
