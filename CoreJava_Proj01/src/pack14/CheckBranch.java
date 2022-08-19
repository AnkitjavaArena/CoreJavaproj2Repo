/*WAP to read student branch and rollNo, and display thee same..
 * 1. read student branch
 *   =>The branch must be in CSE or ECE or EEE, else "Invalid branch"
 *   
 *2. if the branch is valid then read roll no
 *   =>rollno must be 10 digits(Alphanumeric)
 *   =>RollNo must match with the branch
 *
 *SubClass:: CheckBranch
 *  variable :boolean k
 *  Method   :boolean verify(branch)
 *  
 *MainClass: StudentBranchMainClass
 */



package pack14;

public class CheckBranch {
	boolean k=false;
	boolean verify(String branch) {
		switch(branch) {
		case "CSE": k=true;
			break;
		case "ECE": k=true;
			break;
		case "EEE":
			break;
		}//end of switch
		return k;
	}//end of method
}//end of class
