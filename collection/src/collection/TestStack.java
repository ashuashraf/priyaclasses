package collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		int n=5;
		for (int i = 0; i<n; i++) {
			s.push(i);	
		}
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

		System.out.println(s.peek());
		System.out.println(s);
	}

}
