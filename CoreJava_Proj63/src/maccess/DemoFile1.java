/*Wap to copy the image from one location(source) to another location (destination)
 * 
 */


package maccess;
import java.util.Scanner;
import java.io.*;
public class DemoFile1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				System.out.println("Enter the fName anf file path(source)::");
				File f1=new File(s.nextLine());
				FileInputStream fis=new FileInputStream(f1);
				System.out.println("Enter the fpatha nd filenaeme ::(Destination)::");
				File f2=new File(s.nextLine());
				FileOutputStream fos=new FileOutputStream(f2);
				int k;
				while((k=fis.read())!=-1) {
					fos.write(k);
				}//end of while loop
				
				System.out.println("file copied successfully....");
				fos.close();
				fis.close();
			}//end of try 
			catch(Exception e) {
				e.printStackTrace();
			}//end of catch block
		}//end of enhanced try with resource
	}//end of method
}//end of class
