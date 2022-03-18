package collection;
//Java Program to Change elements in ArrayList

//Importing all utility classes
import java.util.*;

//main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an Arratlist object of string type
		ArrayList<String> al = new ArrayList<>();

		// Adding elements to Arraylist
		// Custom input elements
		al.add("Geeks");
		al.add("Geeks");

		// Adding specifying the index to be added
		al.add(1, "Geeks");

		// Printing the Arraylist elements
		System.out.println("Initial ArrayList " + al);

		// Setting element at 1st index
		al.set(1, "For");

		// Printing the updated Arraylist
		System.out.println("Updated ArrayList " + al);
		

        // Removing this word element in ArrayList
        al.remove("Geeks");
 
        // Now printing updated ArrayList
        System.out.println("After the Object Removal " + al);
        
        
        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {
 
            System.out.print(al.get(i) + " ");
        }
 
        System.out.println();
 
        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
	}
}
