package collection;
import java.util.HashMap;
import java.util.WeakHashMap;
class WeakHashothermaps {
    public static void main(String[] args) {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;
        evenNumbers.put(two, twoValue);
        evenNumbers.put(four, fourValue); 
       
        System.out.println("HashMap: " + evenNumbers);

        // Creating a weak hash map from other hashmap
    //  WeakHashMap<String, Integer> numbers = new WeakHashMap<>(evenNumbers);
       WeakHashMap<String, Integer> numbers = new WeakHashMap<>();
       numbers.putAll(evenNumbers);
       System.out.println("WeakHashMap: " + numbers);
       System.out.println("KeySet():= " + numbers.keySet());
       System.out.println("values():= " + numbers.values());
       System.out.println("EntrySet: " + numbers.entrySet());
       int value1=numbers.get("Two");
       System.out.println("getmethod:= " + value1);
       int value2=numbers.getOrDefault("four", fourValue);
       System.out.println("getordefalt :="+value2);
    // Using remove() with single parameter
       int value = numbers.remove("Two");
       System.out.println("Removed value: " + value);

       // Using remove() with 2 parameters
       boolean result = numbers.remove("One", 3);
       System.out.println("Is the entry {One=3} removed? " + result);

       System.out.println("Updated WeakHashMap: " + numbers);


    }
}

