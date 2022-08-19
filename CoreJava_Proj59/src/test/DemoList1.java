package test;
import java.util.*;
public class DemoList1 {
	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
			try {
				List<Product> lt=null;
				System.out.println("===Choice====");
				System.out.println("1.ArrayList\n2.LinkedList\n3.Vector");
				System.out.println("Enter the choice::");
				int choice=s.nextInt();
				switch(choice) {
				case 1:
					lt=new ArrayList<Product>();
					break;
				case 2:
					lt=new LinkedList<Product>();
					break;
				case 3:
					lt=new Vector<Product>();
					break;
				default:
					System.out.println("Invalid Choice!!!!");
					System.exit(0);
				}//end of swicth block
				
				lt.add(new Product("A129","Mou",234.45F,12));
				lt.add(new Product("A130","kbr",234.45F,12));
				lt.add(new Product("A131","Monitor",234.45F,12));
				lt.add(new Product("A132","joystick",234.45F,12));
				lt.add(new Product("A133","touchpad",234.45F,12));
				
				System.out.println("====Itetrator<E>===");
				Iterator<Product> it=lt.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}//end of while loop
				
				System.out.println("===SplIterator<E>===");
				Spliterator<Product> sp=lt.spliterator();
				sp.forEachRemaining((p)->{
					System.out.println(p);
				});
				
				System.out.println("===forEach()===");
				lt.forEach((q)->{
					System.out.println(q);
				}
				);
			}//end of try blcok
			catch(Exception e) {
				e.printStackTrace();
			}//end of catch block
		}//end of try with resource
	}//end of main method
}//end of class
