package test;
import java.util.Scanner;
import java.util.*;
public class DemoSet1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
			Set<Integer> st=null;
			System.out.println("===choice====");
			System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
			System.out.println("Enter the choice....");
			int choice=s.nextInt();
			
			switch(choice) {
			case 1:st=new HashSet<Integer>();
				break;
			case 2:st=new LinkedHashSet<Integer>();
				break;
			case 3:st=new TreeSet<Integer>();
				break;
			default: 
				System.out.println("Invalid choice...");
			}//end of switch
			st.add(new Integer(121));
			st.add(new Integer(122));
			st.add(new Integer(123));
			st.add(new Integer(124));
			System.out.println("===Display from Set===");
			System.out.println(st.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}//end of try with resource
	}//end of main
}//end of class
