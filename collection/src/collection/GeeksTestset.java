package collection;
import java.util.*;
public class GeeksTestset {
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		set.add("Geeks");//duplicates not allowed
		set.add("For");
		set.add("Geeks");
		set.add("Example");
		set.add("Set");
		System.out.println("first set "+ set);
		Set<String> set1 = new HashSet<String>();
		set1.add("set");
		set1.add("For");
		set1.add("Example");
		set1.add("in");
		set1.add("collection");
		System.out.println("second set1 "+ set1);
		Set<String> set2 = new HashSet<String>();
		set2.addAll(set1);
		System.out.println("third set2 "+ set2);
	}
}
