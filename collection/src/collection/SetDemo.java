package collection;
import java.util.*;
public class SetDemo {

  public static void main(String args[]) { 
      int[] c = {34, 22,10,60,30,22}; //duplicate not allowed
      Set<Integer> set = new HashSet<Integer>(); //create an empty set object
      try {
         for(int i = 0; i < 5; i++) {
            set.add(c[i]);
         }
         System.out.println(set);

         TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
         System.out.println("The sorted list is:");
         System.out.println(sortedSet);

         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
      }
      catch(Exception e) {}
   }
} 