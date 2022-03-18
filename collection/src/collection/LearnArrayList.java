package collection;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;

public class LearnArrayList {
	
	public static void main(String[] args) {
	
	/*	String[] StudentName=new String[10];
		
		StudentName[0]="saddam";
		
		StudentName[2]="abdul";
		
	//    StudentName[10]="noorsha";
		
	//	System.out.println("yes");*/
		
		ArrayList<String> StudentName=new ArrayList<>();
		StudentName.add("noorsha");
		System.out.println(StudentName);
		List<Integer> List=new LinkedList();
		List.addAll(List);
		System.out.println(List);
		List.add(1);
		List.add(2);
		List.add(3);
		System.out.println(List);
		List.add(4);
		System.out.println(List);
	    List.add(1, 50);
	    System.out.println(List);
	    List<Integer> newList=new LinkedList();
		newList.add(150);
		newList.add(160);
		List.addAll(newList);
		System.out.println(List);
		/*System.out.println(List.get(1));
		System.out.println(List.get(0));
		List.set(0, null);
		System.out.println(List);
		List.remove(2);
		System.out.println(List);
		List.remove(Integer.valueOf(2));
		System.out.println(List);*/
	//List.clear();
		System.out.println(List);
		List.set(2, 1000);
		System.out.println(List);
		System.out.println(List.contains(150));
		
	}

}
