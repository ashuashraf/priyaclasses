package collection; 
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

class BlockingArrayQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        animals.offer("Hen");
        
        try {
            // Add elements to animals
               animals.put("Dog");
               animals.put("Cat");
               System.out.println("ArrayBlockingQueue: " + animals);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        System.out.println("ArrayBlockingQueue: " + animals);
        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);
        
     // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayBlockingQueue Elements: ");
        while(iterate.hasNext()) {
            System.out.print( iterate.next());
            System.out.print(", ");
        }
        // Using remove()
        String element1 = animals.remove();
        System.out.println("\n Removed Element:");
        System.out.println("Using remove(): " + element1);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);

        // Using clear()
        animals.clear();
        System.out.println("Updated ArrayBlockingQueue: " + animals);

    }
}
