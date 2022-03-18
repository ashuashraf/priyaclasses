package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemapdemo {
	public static void main(String[] args) {
		TreeMap t=new TreeMap(new MyComparator());
		t.put(100, "AAA");
		t.put(101, "BBB");
		t.put(104, "DDD");
		t.put(106, "FFF");
		t.put(103, "CCC");
		t.put(105, "EEE");
		t.put(107, "GGG");
	//	t.put(null, "AAA"); //NullPointerException
		t.put(108, null);
		//t.put("XXX", "AAA"); //ClassCastException
		System.out.println(t);
		
	}
}
class  MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
	}
	
}