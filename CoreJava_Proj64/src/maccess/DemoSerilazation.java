package maccess;
import java.io.*;
import java.util.*;
public class DemoSerilazation {
	public static void main(String[] args) {
		try {
		User u1=new User("nit.v","9898981234",new Date());
		File f=new File("E:\\Images\\obj.txt");
		FileOutputStream fos=new FileOutputStream(f); //fileecreated
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(u1);  //Serialization
		System.out.println("Serialization completed.....");
		fos.close();
		}//end of try
		catch(Exception e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
