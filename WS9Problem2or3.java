/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*WS9 Arrays Problem 2 due 11/13/2019
* File name: WS9Problem2or3.java
************/

import java.util.Scanner;

public class WS9Problem2or3
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Enter n (>1): ");
      int n = kbd.nextInt(), prevcount = 0, count =0;
      int [] Nnums = new int[n];//creation of the array with n elements
      System.out.print("Enter "+n+" integers followed by the space: ");
      
      for (int i = 0; i < n; i++)
      {
         Nnums[i]=kbd.nextInt();
         if (Nnums[i] == 0) count++;
         else if(i !=0){
            Nnums[i-(prevcount+count)] = Nnums[i];
            Nnums[i]=0;
            prevcount += count;
            count = 0;
         }// else
         if (i == (n-1) && prevcount == 0)
         {
            System.out.print("There are no zeros in the array.");
         }
         else if (i == (n-1)){
            System.out.print("The new array with 0's at the end: ");
            for (int ii = 0; ii < n; ii++) System.out.print(Nnums[ii]+" ");
            System.out.println();
            System.out.print("There are "+prevcount+" zeros in the array and there are "+(n-prevcount)+" integers before them");
         }           
      }
   }
}