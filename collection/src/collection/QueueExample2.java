package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
		public static void main(String[] args) {
			Queue<String> names=new LinkedList<>();
			names.offer("saddam");
			names.offer("vaseem");
			names.offer("noorsha");
			names.offer("ashu");
			System.out.println(names);
			String s=names.peek();
			System.out.println("peek value :=  "+  s);
			String s1=names.poll();
			System.out.println("remove name :=  "  + s1);
			System.out.println("updates Queue:= " + names);
			
		}
}
