package maccess;
import java.util.*;
public class SortList {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				ArrayList<Integer> al=new ArrayList<Integer>();
				System.out.println("Ente rthe number of elements to be aded to ArrayList::");
				int n=s.nextInt();
				
				System.out.println("Enter "+n+"Elements::");
				for(int i=0;i<n;i++) {
					al.add(new Integer(s.nextInt()));
				}//end of for loop
				
				System.out.println("===Display from arrayList before sorting::");
				al.forEach((k)->
				{
					System.out.println(k.toString()+" ");
				});
				
				Collections.sort(al);   //sorting process
				System.out.println("===Display from arrayList after sorting::");
				al.forEach((k)->
				{
					System.out.println(k.toString()+" ");
				});
			
				
			}//end of try block
			catch(Exception e) {
				e.printStackTrace();
			}
		}//end fo enhanced try with resources
		s.close();
	}//end of main method
}//end of class
