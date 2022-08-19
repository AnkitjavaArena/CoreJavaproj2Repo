/*Wap to read date from console and write the data into file.
 * 
 */

package maccess;
import java.util.*;
import java.io.*;
public class Demofile2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				File f=new File("E:\\images\\Text.txt");
				
				//creating file
				FileWriter fw=new FileWriter(f);
				System.out.println("Enter the data::(@ at end)");
				char ch;
				while((ch=(char)br.read())!='@') {
					fw.write(ch);   //writing the data to file
				}//end of while loop
				
				System.out.println("Data record Successfully....");
				fw.close();
				br.close();
				
				System.out.println("===Display from file===");
				FileReader fr=new FileReader(f);   //opening the file
				int k;
				while((k=fr.read())!=-1) {
					System.out.println((char)k);
				}//end of while loop
				fr.close();				
			}//end of try block
			catch(Exception e) {
				e.printStackTrace();
			}
		}//end fo enhanced try with resource
	}//end of main method
}//end of class
