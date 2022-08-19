package pack15;
//SubClass
public class CheckPinNo {

	boolean k=false;
	boolean verify(int pinNo){
		switch(pinNo) {
		case 1111:k=true;
			break;
		case 2222:k=true;
			break;
		case 3333:k=true;
			break;
			
		}//end of switch
		return k;
	}//end of method
}//end of class
