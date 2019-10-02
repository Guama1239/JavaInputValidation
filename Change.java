/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 2 Change
* WS4 due 09/25/2019
* File name: Change.java
************/

import java.util.Scanner;// first line of code in program

public class Change//class name, file name
{// public is visibility modifiers // static non visibility // void retun type// main: method name // (String[] args) parameters: type: String type: args
   public static void main (String [] args){
      Scanner nums = new Scanner(System.in);
      System.out.print("Enter the item cost in cents: ");
      // variables needed
      int quarters, dimes, nickles, cost;
      final int cents = 100;
      //input of cost
      cost = nums.nextInt();//captures cost
      quarters = (cents - cost)/25;
      dimes = (cents - cost - (quarters * 25))/10;
      nickles = (cents - cost - (quarters * 25) - (dimes * 10))/5;
      System.out.println("Your change is: ");
      System.out.println(quarters + " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickles + " nickles");
   }
}