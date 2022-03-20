package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysToSet {
	public static void main(String[] args) {
		String[] arr= new String [5];
		arr[0]="ashu";
		arr[1]="suda";
		arr[2]="siva";
		arr[3]="ashu";
		arr[4]="saddam";
		
		Set<String> set=new HashSet<String>(Arrays.asList(arr));
		System.out.println(set);
		
		
	}

}
