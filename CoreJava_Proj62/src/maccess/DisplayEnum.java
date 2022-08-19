package maccess;

public class DisplayEnum {
	public static void main(String[] args) {
		System.out.println();
		for(Cars c: Cars.values()) {
			System.out.println(c.toString()+" costs "+c.getPrice());
		}
	}//end of main method
}//end of class
