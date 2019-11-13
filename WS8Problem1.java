/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS 8 Loops Problem 1 due 11/06/2019
* File name: WS8Problem1.java
************/

import java.util.Scanner;
public class WS8Problem1
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      int num = 0, mulOf3 = 0, mulOf5 = 0;//var counting respective mutliples
      
      do
      {
         System.out.print("Enter an integer: ");
         num = kbd.nextInt();
         if ((num > 0 && num % 3 == 0) && (num > 0 && num % 5 == 0)) { //in case num is multiple of both 3 and 5
            mulOf3++; mulOf5++;}
         else if (num > 0 && num % 3 == 0){
            mulOf3 ++;}
            else if (num > 0 && num % 5 == 0){
               mulOf5 ++;}
      }while (num > 0);
      if (mulOf3 == 0 && mulOf5 == 0){
         System.out.println("No multiples of 3 or 5");}
         else if (mulOf3 > 0 && mulOf5 ==0){
            System.out.println("Multiples of 3: " + mulOf3);
            System.out.println("No multiples of 5");}
            else if (mulOf5 > 0  && mulOf3 ==0){
               System.out.println("Multiples of 5: " + mulOf5);
               System.out.println("No multiples of 3");}
               else {System.out.println("Multiples of 3: " + mulOf3);
                     System.out.println("Multiples of 5: " + mulOf5);}
   }
}