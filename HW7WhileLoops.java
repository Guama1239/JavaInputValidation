/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW7 Loops Problem 2 due 10/23/2019
* File name: HW7WhileLoops.java
************/

import java.util.Scanner;

public class HW7WhileLoops
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      double cont = 0, exit = 0, sum = 0, average = 0;
      
      do
      {
      System.out.print("Enter a score between 0 and 100 or -1 to exit: ");
      exit = kbd.nextDouble();
      if (exit != -1) {
         cont ++;
         sum = sum + exit;
      } else if (cont !=0){// this will prevent division by zero, error handling.
         average = sum/cont;
      }
      }
      while(exit != -1);
      System.out.println("The average is " + average);
      
   }
}