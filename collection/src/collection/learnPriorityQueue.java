package collection;
import java.util.PriorityQueue;
import java.util.Queue;
public class learnPriorityQueue {
	public static void main(String[] args) {
	Queue<Integer> pq=new PriorityQueue<>();
	//Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); 
	pq.offer(40);
	pq.offer(12);
	pq.offer(24);
	pq.offer(36);
	pq.add(10);
	
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.peek());

	//Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); 

	
	}
}
