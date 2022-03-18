package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx3 {
	public static void main(String[] args) {
		Queue<Integer> num=new PriorityQueue<>();
		num.offer(10);
		num.offer(20);
		num.offer(30);
		num.offer(40);
		System.out.println("queue number := "  +  num);
		int num1=num.peek();
		System.out.println("num1 :="  +  num1);
		int num2=num.poll();
		System.out.println("num2  := " +  num2);
		System.out.println("queue number after remove  :="  +num);
		
	}

}
