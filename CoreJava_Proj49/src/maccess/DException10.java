package maccess;

public class DException10 {
	public static void main(String[] args) {
		String str=null;    //NonPrimitive data type
		int len=str.length(); //java.lang.NullPointerException is raised
		System.out.println("Str::"+str.toString());
		System.out.println("length::"+len);
	}//end of main
}//end of class
