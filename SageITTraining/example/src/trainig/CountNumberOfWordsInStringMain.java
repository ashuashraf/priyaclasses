package trainig;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class CountNumberOfWordsInStringMain {
 
    public static void main(String[] args) {
		/*
		 * String str = "welcome to java   tutorial on Java2blog";
		 * 
		 * int count = 1;
		 * 
		 * for (int i = 0; i < str.length() - 1; i++) { if ((str.charAt(i) == ' ') &&
		 * (str.charAt(i + 1) != ' ')) { count++; } }
		 * System.out.println("Number of words in a string : " + count);
		 */

		/*
		 * public static void main(String[] args) throws IOException {
		 */    HashSet<String> legalEnglishWords = new HashSet<String>();
              Scanner file = new Scanner("example.txt");
              int counter = 0;

              while (file.hasNextLine())
              {
                  String line = file.nextLine();

                for (String word : line.split(" "))
                {
                    {
                        legalEnglishWords.add(word);
                    }
                }
              } 

                file.close();

                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter in a message: ");
                String message = scan.nextLine();
                scan.close();

                for (String userInput : message.split(" ")) 
                {
                    if (legalEnglishWords.contains(userInput)) 
                    {
                        System.out.println(userInput + " is an English word ");
                        counter++;
                    }
                    System.out.println(userInput + " occurs " + counter + " times");
                }
    }
}