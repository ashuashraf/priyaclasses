package trainig;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacter {
	public static void main(String[] args) {
		String str="ashraf";
		char[] chars=str.toCharArray();
		Map<Character, Integer> charmap=new HashMap<>();
		for(Character ch:chars) 
		{
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}
			else {
				charmap.put(ch, 1);
			}
			Set<Character> keys=charmap.keySet();
			for(Character character: keys){
				if(charmap.get(ch)>1) {
					System.out.println("charactors :  "+ch+"  repeating  :  "+charmap.get(ch)+"   times");
				}
				
			}
		}
	}
}


