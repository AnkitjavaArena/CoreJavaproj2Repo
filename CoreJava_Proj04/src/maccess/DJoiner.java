package maccess;

import java.util.StringJoiner;

public class DJoiner {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("*/");
		sj.add("java");
		sj.add("language");
		sj.add("program");
		System.out.println(sj.toString());
	}//end of main method
}//end of class
