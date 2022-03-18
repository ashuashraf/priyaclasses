package collection;
import java.util.Deque;
import java.util.ArrayDeque;

class DequeEx1 {

    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
        
        Deque<String> stringtype=new ArrayDeque<>();
        stringtype.offer("LEARN");
        stringtype.offer("java");
        stringtype.offerFirst("ASHU");
        stringtype.offer(" ");
        stringtype.offerLast("BY UMASHANKER");
        System.out.println("Deque: " + stringtype);
        String firstremove=stringtype.peekFirst();
        System.out.println("Deque: " +firstremove);
        String firstremove1=stringtype.peekLast();
        System.out.println("Deque: " +firstremove1);
        String firstpoll=stringtype.pollFirst();
        System.out.println("Deque: " +firstpoll);
        String lastpoll=stringtype.pollLast();
        System.out.println("Deque: " +lastpoll);

        System.out.println("Deque: " +stringtype);
        
    }
}
