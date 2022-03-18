// An example for ArrayList
// All of the classes and
// interfaces of the collection
// framework are bundled into 
// the java.util package
package collection;
import java.util.*;
  
public class BasicArrayList {
  
    // main method
    public static void main(String[] args) {
          
        // Instantiate an ArrayList Object
        // Integer is a wrapper class for 
        // the basic datatype int
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        ArrayList<Integer> intArr1 = new ArrayList<Integer>();
        ArrayList<Integer> intArr2 = new ArrayList<Integer>();
        System.out.println(intArr);
        System.out.println(intArr1); 
        System.out.println(intArr2);
        // Add elements using add() method
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(40);
        intArr.add(50);
        intArr.add(60);
        System.out.println(intArr); 

        intArr1.add(70);
        intArr1.add(80);
        intArr1.add(90);
        intArr1.add(100);
        intArr1.add(110);
        intArr1.add(120);
        System.out.println(intArr1); 

        intArr2.add(130);
        intArr2.add(140);
        intArr2.add(150);
        intArr2.add(160);
        intArr2.add(170);
        intArr2.add(180);
        System.out.println(intArr2);
        
        intArr2.addAll(intArr1);
        System.out.println(intArr2);
        intArr2.remove(6);
        intArr2.remove(7);
        System.out.println(intArr2);
        
        
        // Check if intArr contains the element 25
        
        if(intArr2.contains(120))
        {
            System.out.println("The ArrayList contains 120");
        }
        else
        {
            System.out.println("No such element exists");
        }
          
        // Use get method to get the element at index 1
        int elementAt1 = intArr.get(2);
        System.out.println("The Element at index 1 now is " + elementAt1);


      /*  
         
        // Print the ArrayList on the console
        System.out.println(intArr);
          
        // Remove elements at index 1 and 4
        intArr.remove(1);
        intArr.remove(4);
          
        // Print the ArrayList on the console
        System.out.println(intArr);
          
        // Check if intArr contains the element 25
        if(intArr.contains(25))
        {
            System.out.println("The ArrayList contains 25");
        }
        else
        {
            System.out.println("No such element exists");
        }
          
        // Use get method to get the element at index 1
        int elementAt1 = intArr.get(1);
        System.out.println("The Element at index 1 now is " + elementAt1);*/
          
    }
  
}