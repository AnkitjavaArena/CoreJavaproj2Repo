package maccess;

public class SBuffer3 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(6);
		System.out.println("Default Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("java");
		System.out.println("sb::"+sb);
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		sb.append("hyd");
		System.out.println("sb::"+sb);
		System.out.println("Capacity::"+sb.capacity());
		System.out.println("Length::"+sb.length());
		
	}//end of main method
}//end of class
