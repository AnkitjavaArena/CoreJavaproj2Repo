package test;

public class ProductValues {
	public String pName;
	public float pPrice;
	public int pQty;
	public ProductValues(String pName,float pPrice,int pQty) {
		this.pName=pName;
		this.pPrice=pPrice;
		this.pQty=pQty;
	}//end of constructor
	
	public String toString() {
		return pName+"\t"+pPrice+"\t"+pQty;
	}//end of toString()
}//end of class
