package collection;

import java.util.HashMap;

class HashMapex1 {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // get() method to get value
    String value = languages.get(1);
    System.out.println("Value at index 1: " + value);
    System.out.println("HashMap: " + languages);
    // return set view of keys
    // using keySet()
    System.out.println("Keys: " + languages.keySet());

    // return set view of values
    // using values()
    System.out.println("Values: " + languages.values());

    // return set view of key/value pairs
    // using entrySet()
    System.out.println("Key/Value mappings: " + languages.entrySet());
  }
}