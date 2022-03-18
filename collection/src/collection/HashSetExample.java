package collection;
import java.util.*;
class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber); //2 4 6

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers); //2 4 5 6
        
        HashSet<String> words=new HashSet<>();
        words.add("ashu");
        words.add("learn");
        words.add("hashset");
        words.add("in java");
        System.out.println("words  set :   "+  words);
        HashSet<String> words2=new HashSet<>();
        words.add("programs");
        words.add("practices");
        words.add("hashsetex1");
        words.add("in java1");
        System.out.println("words2  set  :" +  words2);
        words2.addAll(words);
        words2.add("collection chapter");
        System.out.println("after addAll(union) :" +   words2);
        // Calling iterator() method
     //   Iterator<Integer> iterate = numbers.iterator();
       // System.out.print("HashSet using Iterator: ");
     //   // Accessing elements
     //   while(iterate.hasNext()) {
          //  System.out.print(iterate.next()); //2 4 5 6
           // System.out.print(", ");
         //   System.out.println();
         // Using remove() method
            boolean value1 = numbers.remove(5);
            System.out.println("Is 5 removed? " + value1);
            System.out.println(numbers);

            boolean value2 = numbers.removeAll(numbers);
            System.out.println("Are all elements removed? " + value2);
            System.out.println(numbers);
		}
    }
//}

