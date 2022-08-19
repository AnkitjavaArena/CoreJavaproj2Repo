package test;
import test.*;
import java.util.*;
public class DemoMap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Map<String,ProductValues> m=null;
				System.out.println("===Choice===");
				System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.HashTable");
				System.out.println("Enter the choice::");
				int choice=s.nextInt();
				switch(choice) {
				case 1:
					m=new HashMap<String,ProductValues>();
					break;
				case 2: 
					m=new LinkedHashMap<String,ProductValues>();
					break;
				case 3:
					m=new TreeMap<String,ProductValues>();
					break;
				case 4:
					m=new Hashtable<String,ProductValues>();
					break;
				default:
					System.out.println("Invalid choice...");
					System.exit(0);
				
				}//end of switch block
				
				m.put(new String("A121"),new ProductValues("Mouse",234.56F,12));
				m.put(new String("A122"),new ProductValues("Mouse",234.56F,12));
				m.put(new String("A123"),new ProductValues("Mouse",234.56F,12));
				m.put(new String("A124"),new ProductValues("Mouse",234.56F,12));
				m.put(new String("A125"),new ProductValues("Mouse",234.56F,12));
				
				System.out.println("===Display from map<k,v>===");
				m.forEach((p,q)->
				{
					System.out.println(p.toString()+"\t"+q.toString());
				});
			}//end of try blcok
			catch(Exception e) {
				e.printStackTrace();
			}//end of cathc block
		}//end of enhanced try with resource
	}//end of main method
}//end of class
