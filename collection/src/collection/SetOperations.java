package collection;
import java.util.HashSet;

class SetOperations {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(4);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
     //
        System.out.println("HashSet2: " + evenNumbers);
      /*  
        // Union of two set
        evenNumbers.addAll(primeNumbers);
        System.out.println("Union is: " + evenNumbers);
        
        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers); */
        
     // Difference between HashSet1 and HashSet2
      // primeNumbers.removeAll( evenNumbers);
   //     System.out.println("Difference : " +primeNumbers);
        
        // Check if primeNumbers is a subset of numbers
        boolean result = primeNumbers.containsAll(evenNumbers);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
     
    }
    
}
