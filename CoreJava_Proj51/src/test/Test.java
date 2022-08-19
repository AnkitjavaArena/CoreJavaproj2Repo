package test;

public class Test {
	 private static Test t=null;
	 		//private static reference variable
	 private Test() {
		 
	 }//private constructor
	 static {
		 t=new Test();   //con_call
	 }//end of statoc block
	 public void dis(int k) {
		 System.out.println("*******dis(k)******");
		 System.out.println("k::"+k);
	 }//end of instnace method
	 public static Test getRef()  //static method
	 {
		 return t;
	 }//end of static method
	 private class xyz{
		 
	 }
}//end of class
