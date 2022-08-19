package test;

public class Product {
public String pCode,pName;
float pPrice;int pQty;

public Product(String pCode, String pName, float pPrice, int pQty) {
	super();
	this.pCode = pCode;
	this.pName = pName;
	this.pPrice = pPrice;
	this.pQty = pQty;
}//end of constructopr

public String toString() {
	return "pCode::"+pCode+"pName::"+pName+"pPrice::"+pPrice+"pQty::"+pQty;
}//end of toString() method

}//end of class
