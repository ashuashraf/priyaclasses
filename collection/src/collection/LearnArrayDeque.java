package collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adp=new ArrayDeque<>();
		adp.offer(18);
		adp.offerFirst(12);
		adp.offer(23);
		adp.offer(26);
		adp.offerLast(45);
		//adp.offer(10);
		System.out.println(adp);
		System.out.println(adp.peek());
		System.out.println(adp.peekFirst());
		System.out.println(adp.peekLast());
		System.out.println(adp.poll());
		System.out.println("poll():" + adp);
		System.out.println("pollFrist():" + adp);
		System.out.println(adp.pollLast());
		System.out.println("pollLast():" + adp);	
	}
}
