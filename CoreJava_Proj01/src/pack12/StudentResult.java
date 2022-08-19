/*Wap to calculate the result of a student
 * 1. read 6 sub marks
 *   =>these 6 sub marks must be in between 0 to 100, else 'invalid marks'
 *2. if 6 sub marks are valid then calculate the following
 *		totmarks
 *		per
 *		result
 *
 *result::
 *per(70 to 100)-Distinction
 *per(60 to 70)-First class
 *per(50 to 60)-Second class
 *per(35 to 50)-third Class
 *else fail
 *
 *Subclass:StudentResult
 *variables: per,result
 *methods:: void calculate(int totMarks)
 *
 *MainClass: StudentMainClass
 *method :psvm()
 */


package pack12;

//subClass
public class StudentResult {

	float per;
	String result;
	void calculate(int totMarks) {
		per=(float)totMarks/6;   //type casting
		if(per>=70 && per<=100) {
			result="Distinction";
		}
		else if(per>=60 && per<70) {
			result="FirstClass";
		}
		
		else if(per>=50 && per<60)
			result="SecondClass";
		else if(per>=35 && per<50)
			result="ThirdClass";
		else
			result="fail";
		
		System.out.println("Percentage::"+per+"%");
		System.out.println("Result::"+result);
	}//end of method
}//end of class



















