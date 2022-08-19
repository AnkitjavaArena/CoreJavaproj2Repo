/* WAP to display product details
 * prodCode,prodName,prodPrice,prodQty
 */

package pack04;

public class Product {

	String prodCode,prodName;
	float prodPrice;
	int prodQty;
	
	void getProductDetails() {
		System.out.println("ProdCode::"+prodCode);
		System.out.println("ProdName::"+prodName);
		System.out.println("ProdPrice::"+prodPrice);
		System.out.println("ProdQty::"+prodQty);
	}//end of method
	
	public static void main(String args[]) {
		Product p=new Product();
		p.prodCode="A121";
		p.prodName="Mouse";
		p.prodPrice=234.45F;
		p.prodQty=12;
		
		//call the method
		p.getProductDetails();
	}//end of main
	
	
}//end of class
