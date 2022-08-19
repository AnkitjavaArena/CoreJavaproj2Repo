/*WAP to display bookdetails
 * bCode,bName,bAuthor,bPrice,bQty
 */


package pack05;

public class BookDetails {
	String bCode,bName,bAuthor;
	float bPrice;
	int bQty;
	
	void getBookDetails() {
		System.out.println("BookCode::"+bCode);
		System.out.println("BookName::"+bName);
		System.out.println("BookAuthor::"+bAuthor);
		System.out.println("BookPrice::"+bPrice);
		System.out.println("BookQty::"+bQty);
	}//end of method
	
	public static void main(String args[]) {
		BookDetails bd=new BookDetails();
		bd.bCode="A121";
		bd.bName="C-lang";
		bd.bAuthor="B-Swamy";
		bd.bPrice=234.45f;
		bd.bQty=12;
		//calling method
		bd.getBookDetails();
	}//end of main
}//end of class
