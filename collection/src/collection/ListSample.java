package collection;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		List<Integer>  list=new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(7);
		list.add(8);
		
		System.out.println(list); //[5, 5, 7, 8]
		list.add(0, 1);
		list.add(10);
		System.out.println(list);//[1, 5, 5, 7, 8, 10] 
		//list.remove(3);
	//	list.remove(8); //Index 8 out of bounds for length 4
	//	list.removeAll(list);
	//	list.clear();
		System.out.println(list.get(3)); // 5
		System.out.println("5 is contains in list :" + list.contains(5)); //true
		
		System.out.println(list); //[1, 5, 5, 7, 8, 10]
		
		
		list.set(0, 20);
		System.out.println(list);	
		
		
	//	list.clear();
		//System.out.println(list);	
        list.indexOf(2);
		System.out.println( list.indexOf(7));	

		
	}

}
