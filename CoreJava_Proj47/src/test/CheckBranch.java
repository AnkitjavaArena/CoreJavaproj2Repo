package test;

public class CheckBranch {
	public boolean k=false;
	public boolean verify(String br) {
		switch(br) {
		case "ECE":k=true;
			break;
		case "CSE":k=true;
			break;
		case "EEE":k=true;
			break;
		}//end of switch
		return  k;
	}//end of method
}//end of class
