package test;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Stack<Integer> st=new Stack<Integer>();
				while(true) {
					System.out.println("===Choice===");
					System.out.println("1.push\n2.pop\n3.search\n4.exit");
					System.out.println("Enter the choice::");
					int choice=s.nextInt();
					
					switch(choice) {
					case 1:
						System.out.println("Enter the element::");
						st.push(new Integer(s.nextInt()));
						System.out.println(st.toString());
						System.out.println("peek element::"+st.peek());
						break;
					case 2:
						if(st.empty()) {
							System.out.println("stack is empty....");
						}//end of if case
						else {
							st.pop();
							System.out.println(st.toString());
						}//end of else block
						break;
					case 3:
						if(st.empty()) {
							System.out.println("stack is empty...");
						}//end of if block
						else {
							System.out.println("Enter the element to be searched...");
							Integer ele=new Integer(s.nextInt());
							int pos=st.search(ele);
							if(pos>0) {
								System.out.println("Element at pos::"+pos);
							}
							else {
								System.out.println("Element not available....");
							}
						}
						break;
					case 4:
						System.out.println("Exited from stack...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid choice...");
					}//end of switch block
				}//end of while loop
			}//end of try block
			catch(Exception e) {//end of catch block
				e.printStackTrace();
			}
		}//end of enhanced try with resource
	}//end of main
}//end of class
