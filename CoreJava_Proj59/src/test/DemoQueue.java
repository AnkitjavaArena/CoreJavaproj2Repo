package test;
import java.util.*;
public class DemoQueue {
	public static void main(String[] args) {
		System.out.println("===PriorityQueue<E>===");
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(new Integer(12));
		pq.add(new Integer(13));
		pq.add(new Integer(14));
		pq.add(new Integer(15));
		System.out.println(pq.toString());
		System.out.println("===ArrayDeque<E>===");
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(new Integer(12));
		ad.add(new Integer(13));
		ad.add(new Integer(14));
		ad.add(new Integer(15));
		System.out.println(ad.toString());
		System.out.println("===LinkedList<E>===");
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(new Integer(12));
		ll.add(new Integer(13));
		ll.add(new Integer(14));
		ll.add(new Integer(15));
		System.out.println(ll.toString());
		ll.addFirst(new Integer(11));
		ll.addLast(new Integer(16));
		System.out.println(ll.toString());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll.toString());
	}//end of main
}//end of class
