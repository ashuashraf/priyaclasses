package collection;

import java.util.LinkedList;

public class LinkedListExample {
		public static void main(String[] args) {
			LinkedList ll=new LinkedList<>();
			ll.add("ashu");
			ll.add("learn");
			ll.add("java");
			ll.add("at");
			ll.add(5.35);
			ll.add("am");
			System.out.println(ll);  //[ashu, learn, java, at, 5.35, am]
			ll.set(3, "by umashankar");
			System.out.println(ll);  //[ashu, learn, java, by umashankar, 5.35, am]
			ll.removeLast();
			System.out.println(ll);//[ashu, learn, java, by umashankar, 5.35]
			ll.remove(2);
			System.out.println(ll);//[ashu, learn, by umashankar, 5.35]
			ll.removeFirst();
			System.out.println(ll);//[learn, by umashankar, 5.35]
		}
}
