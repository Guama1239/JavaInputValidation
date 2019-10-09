/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS5 Problem 2 due 10/02/2019
* File name: SplitTheInput.java
************/
import java.util.Scanner;


public class SplitTheInput//class name, file name
{// public is visibility modifiers // static non visibility // void retun type// main: method name // (String[] args) parameters: type: String type: args
   public static void main (String [] args){
      // worksheet 09/25/2019 problem 2 split the input
      Scanner words = new Scanner(System.in);//Define Scanner similar to the use for numbers
      
      System.out.print("Enter a word : ");// asks user for input
      String  word1 = words.nextLine();// nextLine command allows for messages containing spaces like two words
      
      System.out.println("The length of " + "\"" + word1 + "\""+" is " + word1.length());
      
      System.out.println("The first letter is " + "\"" + word1.charAt(0) + "\"");//
      
      System.out.println("The middle letter is " + "\"" + word1.charAt(word1.length()/2) + "\"");
      
      System.out.println("The last letter is " + "\"" + word1.charAt(word1.length()-1) + "\"");
            
   }
}
