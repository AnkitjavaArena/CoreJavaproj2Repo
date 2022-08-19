//performing serialization and deserialisation


package maccess;
import java.io.*;
import java.util.*;
public class User implements Serializable{
	public String userName,mailId;
	public Date d;
	public User(String userName,String mailId,Date d) {
		this.userName=userName;
		this.mailId=mailId;
		this.d=d;
	}//end of constructor
	
	public String toString() {
		return "UserName::"+userName+"MailId::"+mailId+"Date&time::"+d;
	}//end of method
}//end of class
