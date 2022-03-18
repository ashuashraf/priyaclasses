package collection;

import java.util.ArrayList;

public class ListtoArrays {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(01);
		list.add(02);
		list.add(03);
		list.add(04);
		System.out.println("list :"+list);
		Integer[] myArray=new Integer[list.size()];
		list.toArray(myArray);
		System.out.println("Arrays list  :"+list);
		
		 if (list.contains(5))
	            System.out.println("5 exists in the ArrayList");
	  
	        else
	            System.out.println("5 does not exist in the ArrayList");
	}

}
