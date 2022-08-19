package pack20;
//subclass
public class User {

	String userName,mailId; //instance variables memory in  Object
	long phoneNo; //instance variable memory in object
	User(String a,String b,long c){
		//a,b,c are local variables so memory in method_frame
		userName=a;
		mailId=b;
		phoneNo=c;
	}//end of cons
	
	//constructor is used to load data from local variables to instance variables
	void getUser() {
		System.out.println("===User===");
		System.out.println("UserName::"+userName);
		System.out.println("MailId::"+mailId);
		System.out.println("PhoneNo::"+phoneNo);
	}//end of method
	
}//end of class
