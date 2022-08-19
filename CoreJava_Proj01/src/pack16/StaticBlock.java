package pack16;
//MainClass
public class StaticBlock {
	public static void main(String[] args) {
		STest1 ob1=new STest1();   //object1
		STest1 ob2=new STest1();   //object2
		System.out.println("msg from main()---->Hello World");
	}//end of main
	static {
		System.out.println("===MainClass::StaticBlock====");
	}
}//end of class
