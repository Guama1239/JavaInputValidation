/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW7 Loops Problem 4 due 10/23/2019
* File name: HW7DivisibleLines.java
************/

import java.util.Scanner;

public class HW7DivisibleLines
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      int num = 0, cont = 0, exit = 0, sum = 0, average = 0;
      System.out.print("Enter a number larger than 20: ");
      num = kbd.nextInt();
      
      for (int i = 2; i <= num; i++)
      {
         if ((i % 2 == 0) && !(i % 3 == 0)){
            System.out.print(" " + i);
            cont ++;
         }else if (!(i % 2 == 0) && (i % 3 ==0 )){
                  System.out.print(" " + i);
                  cont ++;
         }
         if (cont >= 10){
            System.out.println();
            cont = 0;
         }
      }     
   }
}