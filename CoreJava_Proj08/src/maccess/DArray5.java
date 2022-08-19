//Jagged Array

package maccess;

public class DArray5 {
	public static void main(String[] args) {
		Integer a1[]= {1,2,3};
		Integer a2[]= {11,12,13,14};
		Integer a3[]= {21,22,23,24,25};
		Integer a[][]= {a1,a2,a3};
		
		System.out.println("===Display from Jagged Array===");
		for(int i=0;i<a.length;i++) {
			System.out.println("Array-"+(i+1)+" ");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}//end of for loop
		
	}//end of main method
}//end of class
