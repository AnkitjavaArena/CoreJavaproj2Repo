package test;

public class Display {
	public Product p; //reference varaible
	public Display(Product p) {
		this.p=p;
	}
	public void dis() {
		System.out.println(p.toString());
	}//end of dis method
}//end of class
