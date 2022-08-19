package maccess;

import java.util.Scanner;

import test.Display;
import test.Product;
import test.Read;

public class RefMainClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Product p=new Product();
		Read r=new Read(p);   //Con_call
		r.read(s); //Scanner reference as parameter
		Display d=new Display(p);  //Con_call
		d.dis();
	}//end of main method
}//end of class
