/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS 7B Loops Problem 1 due 10/30/2019
* File name: Ws7BProblem1.java
************/

import java.util.Scanner; // not needed it for this particular program, just out of habit to remember it.
public class WS7BProblem1
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      int Heads = 0; int Tails = 0;
      for (int i = 1; i <= 1000000; i++)
      {
         int flip = (int)(Math.random()*2);
         if (flip == 0) {
            Heads++;       
         }
         else {
            Tails++;
         }
      }
      System.out.println("Heads: " + Heads);
      System.out.println("Tails: " + Tails);
      System.out.println(Heads + " Heads + " + Tails + " Tails is " + (Heads+Tails) + " flips");
   }
}