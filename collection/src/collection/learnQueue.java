package collection;
import java.util.LinkedList;
import java.util.Queue;
public class learnQueue {
		public static void main(String[] args) {
			Queue<Integer> queue=new LinkedList<>();
			queue.offer(12);
			queue.offer(14);
			queue.offer(16);
			 System.out.println(queue);
			System.out.println(queue.poll());
			 System.out.println(queue);
			 System.out.println(queue.peek());
			 System.out.println(queue.poll());
			 System.out.println(queue);
			 queue.offer(20);
			 System.out.println(queue);
		}
	}