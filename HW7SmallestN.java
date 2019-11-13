/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW7 Loops Problem 3 due 10/23/2019
* File name: HW7SmallestN.java
************/

import java.util.Scanner;

public class HW7SmallestN
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      int num = 0, cont = 0, exit = 0, sum = 0, average = 0;
      System.out.print("Enter a number larger than 10: ");
      num = kbd.nextInt();
            
      do
      {
      cont ++;
      exit = cont * cont;
      }
      while(exit <= num);
      System.out.println("The smallest value for n that gives n * n > " + num + " is " + cont);
      
   }
}