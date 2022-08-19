package test;

public class Greater implements IComparable {
	public void compare(int x,int y) {
		if(x>y)
			System.out.println("Greater value x::"+x);
		else
			System.out.println("Greater value y::"+y);
	}//end  of method

}//end of class
