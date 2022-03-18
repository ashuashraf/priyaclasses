package collection;

import java.util.HashMap;
import java.util.Map;

public class MapEXAMPLE {
	public static void main(String[] args) {
		Map<String, Integer> MH=new HashMap<>();
		MH.put("pubg", 5);
		MH.put("battle", 1);
		MH.put("ground", 4);
		MH.put("unknow", 3);
		MH.put("play", 2);
		System.out.println("Map set:=" + MH);
		System.out.println("keySet:=" + MH.keySet() );
		System.out.println("values:=" + MH.values() );
	//	System.out.println("entrySet :=" +MH.entrySet());
		int a=MH.remove("play");
		System.out.println("remove values:=" + a );
		System.out.println("Map set:=" + MH);
		System.out.println("entrySet :=" +MH.entrySet());
	}
}