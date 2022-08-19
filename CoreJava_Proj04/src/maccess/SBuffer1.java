package maccess;

public class SBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(); //Con_call
		System.out.println("Default capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("java");
		System.out.println("sb::"+sb.toString());
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("program");
		System.out.println("sb::"+sb.toString());
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("language");
		System.out.println("sb::"+sb.toString());
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		
	}//end of main method
}//end of class
