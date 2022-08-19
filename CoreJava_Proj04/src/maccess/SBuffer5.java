package maccess;

public class SBuffer5 {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("===sb1===");
		System.out.println("Default Capacity::"+sb1.capacity());
		System.out.println("Length::"+sb1.length());
		sb1.append("java");
		System.out.println("sb1::"+sb1);
		System.out.println("Capacity::"+sb1.capacity());
		System.out.println("Length::"+sb1.length());
		System.out.println("===sb2===");
		System.out.println("Default Capacity::"+sb2.capacity());
		System.out.println("Length::"+sb2.length());
		sb2.append("Program");
		System.out.println("sb2::"+sb2);
		System.out.println("Capacity::"+sb2.capacity());
		System.out.println("Length::"+sb2.length());
	}//end of main method
}//end of main
