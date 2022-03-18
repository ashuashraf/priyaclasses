package collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class BlockingQueueEx1 {

    public static void main(String[] args) {
      // Create a blocking queue using the ArrayBlockingQueue
      BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(8);

      try {
        // Insert element to blocking queue
        numbers.put(2);
        numbers.put(1);
        numbers.put(3);
        numbers.put(4);
        numbers.put(5);
        numbers.put(7);
        numbers.put(6);
        numbers.put(0);
        //numbers.put(4);
        
        System.out.println("BLockingQueue: " + numbers);

        // Remove Elements from blocking queue
        int removedNumber = numbers.take();
        System.out.println("Removed Number: " + removedNumber);
      }

      catch(Exception e) {
          e.getStackTrace();
      }
    }
}
