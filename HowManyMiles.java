/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 1 HowManyMiles
* WS4 due 09/25/2019
* File name: HowManyMiles.java
************/

import java.util.Scanner;// first line of code in program

public class HowManyMiles//class name, file name
{// public is visibility modifiers // static non visibility // void retun type// main: method name // (String[] args) parameters: type: String type: args
   public static void main (String [] args){
      Scanner nums = new Scanner(System.in);
      System.out.print("Enter a distance in miles: ");
      
      double mileDistance = nums.nextInt();// captures miles amount
      double feetDistance = mileDistance*5280;// multiplies to get feet
      double inchesDistance = feetDistance*12;// multiplies to get inches
      
      System.out.println("The distance in inches is: " + (int)inchesDistance); // displays inches value.
      
      double twiceInches = (inchesDistance * 2) + 5; // double the amount of inches and adds 5 per instructions
      double newFeetDistance = twiceInches / 12;// divides to get feet
      double newInches = twiceInches % 12;// gets the remainder of inches from the new inches amount
      double newMilesDistance = (newFeetDistance) / 5280;
      
      System.out.println("Your new distance is " + (int)newFeetDistance + " ft. and " + (int)newInches + " in");
      System.out.print("The total miles is now " + newMilesDistance);
      
   }
}