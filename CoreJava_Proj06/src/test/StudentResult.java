package test;

public class StudentResult {
	public float per;
	public String result;
	public void calculate(int totMarks,boolean b)
	{
		per=(float)totMarks/6;  //typecasting
		if(b) {
			result="fail";
		}
		else if(per>=70&&per>=100)
			result="Distinction";
		else if(per>=60&&per<70)
			result="FirstClass";
		else if(per>=50&&per<60)
			result="SecondClass";
		else if(per>=35&&per<50)
			result="ThirdClass";
		else {
			result="fail";
		}
		System.out.println("Percentage::"+per+"%");
		System.out.println("Result::"+result);
	}//end of method
}//end of class
