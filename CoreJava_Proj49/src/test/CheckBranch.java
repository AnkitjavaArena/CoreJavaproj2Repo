package test;

@SuppressWarnings("serial")
public class CheckBranch extends Exception {
	public CheckBranch() {
		
	}
	
	public CheckBranch(String msg) {
		super(msg);
	}//end of cons
	public void verify(String br)throws CheckBranch{
		try {
			switch(br) {
			case "CSE":
				break;
			case "ECE":
				break;
			case "EEE":
				break;
			default: //raise exception
				CheckBranch cb=new CheckBranch("Invalid branch....");
				throw cb;
			}//end of switch
		}//end of try
		catch(CheckBranch cb) {
			throw cb;  //re-throwing process
		}//end of catch
	}//end of method
}//end of class
