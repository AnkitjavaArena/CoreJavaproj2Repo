package maccess;

import java.util.Date;

import test.TransLog;

public class DemoPoly3 {
	public static void main(String[] args) {
		TransLog ob=new TransLog(6123456L,313131L,12000,new Date());
						//immutable object
		System.out.println("====Details of Transaction=====");
		System.out.println("HAccNo::"+ob.gethAccNo());
		System.out.println("BAccNo::"+ob.getbAccNo());
		System.out.println("Amt::"+ob.getAmt());
		System.out.println("Date&Time::"+ob.getD());
	}//end of main method
}//end of class
