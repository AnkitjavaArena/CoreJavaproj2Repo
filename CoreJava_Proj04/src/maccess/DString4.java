package maccess;

public class DString4 {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		String s3="java";
		String s4="java";
		System.out.println("===new operator process===");
		if(s1==s2)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		System.out.println("===String Literal process===");
		if(s3==s4)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	}//end of main
}//end of class
