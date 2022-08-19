package maccess;

public class SBuffer4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("nit");
		System.out.println("Default capacity::"+sb.capacity());
		System.out.println("length::"+sb.length());
		sb.append("javalanguage");
		System.out.println("sb::"+sb);
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("program");
		System.out.println("sb::"+sb);
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		
	}//end of main method
}//end of class
