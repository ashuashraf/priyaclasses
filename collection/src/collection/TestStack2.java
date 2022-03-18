package collection;

import java.util.Stack;

public class TestStack2 {

	public static void main(String[] args) {
		  Stack stack1 = new Stack(); //// Default initialization of Stack
		  
		  Stack<String> stack2 = new Stack<String>(); // Initialization of Stack using Generic
		  
		  stack1.push("welcome");
		  stack1.push("To");
		  stack1.push("Stack");
		  stack1.push("in");
		  stack1.push("collection1");
		  System.out.println(stack1);
		  
		  stack2.push("Welcome");
		  stack2.push("To");
		  stack2.push("Stack");
		
		  System.out.println(stack2);

	        // Fetching the element at the head of the Stack
	        System.out.println("The element at the top of the" + " stack is: " + stack1.peek());
	        System.out.println("The element at the top of the" + " stack is: " + stack2.peek());

	        // Displaying the Stack after the Operation
	        System.out.println("Final Stack: " + stack1);
	        System.out.println("Final Stack: " + stack2);

	        // Removing elements using pop() method
	        System.out.println("Popped element: "
	                           + stack1.pop());
	        System.out.println("Popped element: "
	                           + stack1.pop());
	 
	        // Displaying the Stack after pop operation
	        System.out.println("Stack after pop operation "
	                           + stack1);
		  

	        // Removing elements using pop() method
	        System.out.println("Popped element: "
	                           + stack2.pop());
	        System.out.println("Popped element: "
	                           + stack2.pop());
	 
	        // Displaying the Stack after pop operation
	        System.out.println("Stack after pop operation "
	                           + stack2);
	        stack2.push("to ");
	        stack2.push("seaching element");
	        System.out.println(stack2);
	        System.out.println();
	        System.out.println(stack2);
	}

	 public static void search(Stack<String> stack2, int i) {
		
		
	}
	}

