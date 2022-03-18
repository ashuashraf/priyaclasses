package collection;

import java.util.Vector;

public class VectorPractices {
		public static void main (String[] args) {
			int n=10;
			Vector<Integer> v=new Vector<Integer>(10,5);
			System.out.println(v);
			System.out.println();
			for(int i=1; i<=n; i++) {
				v.add(i);
			}
			System.out.println(v);
			v.add(11);
			v.remove(3);
			System.out.println(v);
			
			for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
			}
	}
}
