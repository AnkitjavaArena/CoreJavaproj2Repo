package test;

public class WithDraw implements Transaction{
	public void process(int amt) {
		if(amt<=b.bal) {
			System.out.println("Amt Withdrawn::"+amt);
			b.bal=b.bal-amt;
			b.getBalance();
			System.out.println("Transaction completed....");
		}//end of if
		else {
			System.out.println("Insufficient fund...");
		}//end of else 
	}//end of method

}//end of class
