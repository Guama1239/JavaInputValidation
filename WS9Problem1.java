/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS09 Arrays and Loops Problem 1 due 11/13/2019
* File name: WS9Problem1.java
************/

import java.util.Scanner;

public class WS9Problem1
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Enter n (>): ");
      int n = kbd.nextInt();
      // declaration of array based on n
      int [] Nnums = new int[n];
      int [] SoloNums = Nnums;
      int MinNum = 0;
      int Flag = 0;
      System.out.print("Enter "+n+" integers: ");
      
      for (int i = 0; i < n; i++)
      {
          Nnums[i] = kbd.nextInt();
          if (i == 0) MinNum = Nnums[i];
          if (MinNum > Nnums[i])
          {
            MinNum = Nnums[i];
            Flag = i;
          }
          if (i == (n-1))
          {
            if (Flag == n-1) System.out.print("No numbers after min");
            else {
               System.out.print("After minimum: ");
               for (int ii = (Flag+1); ii < n; ii++)
               {
                  System.out.print(Nnums[ii]+ " ");
               }               
            }
          }
      }
   }
}