package test;

public class PDisplay {
	private int k=100;
	private void m() {
		System.out.println("****private method m()*******");
		System.out.println("k::"+k);
	}//end of method
	public void dis() {
		this.m();  //private method_call
	}//end of method
}//end of class
