package collection;
import java.util.TreeMap;

class TreeMapPrograms{
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);//{One=1,Two=2,Three=3}

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());   //[One=1,Two=2,Three=3]

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());      //[One, Two, Three]

        // Using values()
        System.out.println("Values: " + numbers.values());    //[1,2,3]
    }
}
