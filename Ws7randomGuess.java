/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS7 Methods and Conditions Problem 1 due 10/23/2019
* File name: Ws7randomGuess.java
************/

import java.util.Scanner;

public class Ws7randomGuess
{
   public static void main(String[] args){
      Scanner kbd = new Scanner(System.in);
      System.out.print(" Guess a number between 0 and 100: ");
      int numG = kbd.nextInt();
      
      int ramN = (int)(Math.random() * 100 + 1);
      if (ramN == numG)
         System.out.println(" That's Correct!!");
      else
         System.out.println(" Nope, sorry!!" + " the correct number is: " + ramN);
   }
}