package maccess;
import test.*;
public class Generalization2 {
	public static void main(String[] args) {
		System.out.println("===Normal interface process===");
		IClass ob1=new IClass();
		ob1.m1(11);
		ob1.m2(12);
		System.out.println("===Generalisation process====");
		ITest ob2=new IClass();
		ob2.m1(11);
		//ob2.m2(12); //compilation error
	}//end of main
}//end of generalization method
