package collection;
import java.util.Stack;
public class learnstack {
		public static void main(String[] agrs) {
             Stack<String> animals=new Stack<>();
             animals.push("lion");
             animals.push("dog");
             animals.push("horse");
             animals.push("cat");
             System.out.println(animals);
             System.out.println(animals.peek());
            
             System.out.println(animals);
             animals.pop();
             System.out.println(animals);
             
             
             
		}
	}
