package test;

import java.util.Scanner;

public class Read {
	public Product p;   //Reference Variable
	public Read(Product p) {
		this.p=p;
	}//end of constructor
	
	public void read(Scanner s) {
		System.out.println("Enter the ProdCode::");
		p.pCode=s.nextLine();
		System.out.println("Enter the productName::");
		p.pName=s.nextLine();
		System.out.println("Enter the ProdPrice::");
		p.pPrice=s.nextFloat();
		System.out.println("Enter the product quantity::");
		p.pQty=s.nextInt();
	}//end of method
}//end of class
