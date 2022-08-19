package maccess;

public class DString1 {

	public static void main(String[] args) {
		String s1="java";   //String literal process
		String s2=new String("Program"); //Con_call
		String s3=s1.concat(s2);  //Concatenation process
		            //Instance_Factory_Method
		int len1=s1.length();
		int len2=s2.length();
		int len3=s3.length();
		
		System.out.println("===Details===");
		System.out.println("s1::"+s1.toString());
		System.out.println("Length of s1::"+len1);
		System.out.println("s2::"+s2.toString());
		System.out.println("Length of s2::"+len2);
		System.out.println("s3::"+s3.toString());
		System.out.println("Length of s3::"+len3);
		
	}//end of main
}//end of class
