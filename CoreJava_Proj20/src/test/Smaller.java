package test;

public class Smaller implements IComparable{
	public void compare(int x,int y) {
		if(x<y)
			System.out.println("Smaller val x::"+x);
		else
			System.out.println("Smaller val y::"+y);
	}//end of method
}//end of class
