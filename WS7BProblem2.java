/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS 7B Loops Problem 2 due 10/30/2019
* File name: WS7BProblem2.java
************/

import java.util.Scanner;
public class WS7BProblem2
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      int BigS = 0,SmallS = 0,EndV = 0,Prev;
      
      do
      {  
         Prev = EndV;
         System.out.print("Enter a positive integer: ");
         EndV = kbd.nextInt();
         if (EndV > 0 && EndV - Prev > 5)
            BigS++;
         else if (Prev != 0 && EndV - Prev <= 5 && EndV - Prev > 0)
            SmallS++;
         
      }
      while (EndV > 0 && EndV > Prev);
      
      System.out.println("Big steps: " + BigS);
      System.out.println("Small steps: " + SmallS);
      System.out.println("Ending value: " + EndV);      
   }
}