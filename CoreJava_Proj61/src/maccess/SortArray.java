package maccess;
import java.util.*;
public class SortArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				System.out.println("Enter the size of array::");
				int n=Integer.parseInt(s.nextLine());
				Integer a[]=new Integer[n];   //array of n elements
				System.out.println("Enter "+n+"Elements::");
				for(int i=0;i<n;i++) {
					a[i]=new Integer(s.nextInt());
				}//end of for loop
				
				System.out.println("===Display Array before sorting::");
				for(Integer k:a)			//extended for loop
				{
					System.out.print(k.toString()+" ");
				}//end of enhanced for loop
				
				Arrays.sort(a);   //sorting process
				System.out.println("\n===Display array after sorting===");
				for(Integer k:a) {
					System.out.print(k.toString()+" ");
				}
				
			}//end of try block
			catch(Exception e) {
				
			}//end of catch block
		}//end of enhanced try with resource
	}//end of main method
}//end of class
