package maccess;

public enum Cars {
	Figo(900),Alto(300),Dezire(600);  //elements
	public int price;
	private Cars(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}//end of method

}//end of enum
