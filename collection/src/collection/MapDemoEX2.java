package collection;

import java.util.HashMap;
import java.util.Map;

class MapDemoEX2 {
	public static void main(String[] args) {

	Map<String, Double> keyvalues=new HashMap<>(); 
		keyvalues.put("four.three",4.3);
		keyvalues.put("five.one",5.1);
		 System.out.println("Map: " + keyvalues);
		 System.out.println("Keys: " + keyvalues.keySet());
		 System.out.println("values: " + keyvalues.values());
	     System.out.println("Entries: " + keyvalues.entrySet());
	     Double value=keyvalues.remove("four.three");
	     System.out.println("Removed Value: " + value);
	    System.out.println("Map: " + keyvalues);
	Map<String, Integer> Example=new HashMap<>();
		Example.put("ashu", 1);
		Example.put("saddam", 2);
		Example.put("noorsha", 3);
		System.out.println("Map set:=" + Example);
		System.out.println("keyset :=" + Example.keySet());
		System.out.println("valueset:=" + Example.values());
		System.out.println("Entryset:=" + Example.entrySet());
		int rm=Example.remove("ashu");
		System.out.println("remove =" + rm);
		System.out.println("Map set:=" + Example);
	
	}
}
