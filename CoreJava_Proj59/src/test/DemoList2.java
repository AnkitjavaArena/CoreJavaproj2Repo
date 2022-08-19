package test;
import java.util.*;
public class DemoList2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(12));
		al.add(new Integer(13));
		al.add(new Integer(14));
		System.out.println(al.toString());
		al.add(1,new Integer(500));
		System.out.println(al.toString());
		al.remove(1);
		System.out.println(al.toString());
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(new Integer(new Integer(12)));
		li.add(new Integer(new Integer(13)));
		li.add(new Integer(new Integer(14)));
		System.out.println(li.toString());
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(new Integer(12));
		v.addElement(new Integer(13));
		v.addElement(new Integer(14));
		v.addElement(new Integer(15));
		v.addElement(new Integer(16));
		System.out.println(v.toString());
		System.out.println("Element at index 2::"+v.elementAt(2));
		v.set(2,500);
		System.out.println(v.toString());
	}//end of main
}//end of class
