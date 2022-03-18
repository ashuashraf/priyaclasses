package collection;
import java.util.TreeMap;

class TreeMapEX3 {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);
        System.out.println("TreeMap: " + numbers);
        
        // remove method with single parameter
   /*    int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);
        System.out.println("Updated TreeMap: " + numbers);

       // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        //System.out.println("Updated TreeMap: " + numbers);*/
        // Using replace()
        numbers.replace("Two", 22);
        numbers.replace("Three", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);

       // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 10);
        System.out.println("TreeMap using replaceAll: " + numbers);
        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());


        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
