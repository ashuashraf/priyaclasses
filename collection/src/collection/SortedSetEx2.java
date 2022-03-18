package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx2 {
		public static void main(String[] args) {
			SortedSet<String> ss=new TreeSet<>();
			ss.add("java");
			ss.add("learn");
			ss.add("with");
			ss.add("laptop");
			System.out.println("SortedSet: " + ss);
			String firstnumber=ss.first();
			System.out.println("firstnumber :=  "  +  firstnumber);
			String lastnumber=ss.last();
			System.out.println("lastnumber  :=  "   +  lastnumber);
			boolean result=ss.remove("with");
			System.out.println("with  is remove := " + result);
			ss.add("home");
			System.out.println("SortedSet  := " + ss);
			
		}
	}
