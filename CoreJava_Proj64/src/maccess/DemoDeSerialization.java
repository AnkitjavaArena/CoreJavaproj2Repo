package maccess;
import java.io.*;
public class DemoDeSerialization {
	public static void main(String[] args) {
		try {
			File f=new File("E:\\Images\\obj.txt");
			FileInputStream fis=new FileInputStream(f); //open file
			ObjectInputStream ois=new ObjectInputStream(fis);
			User u2=(User)ois.readObject();   //De-Serializtion
			System.out.println("===Displaybuser details===");
			System.out.println(u2.toString());
			fis.close();
		}//end of try
		catch(Exception e) {
			e.printStackTrace();
		}//end of catch block
	}//end of main method
}//end of class


/* Note:: Allprograms are there exceprt GUI programs of L:50
 *if requied please go through l:50 core java mybatch notes file.
 */
