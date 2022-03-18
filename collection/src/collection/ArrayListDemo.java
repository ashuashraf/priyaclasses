package collection;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		System.out.println();
		al.remove(2);
		System.out.println(al);
		System.out.println();
		al.add(0, 1);
		System.out.println(al);
		System.out.println();
		al.add(2, "m");
		System.out.println(al);
	}

}
