/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS5 Problem 1 due 10/02/2019
* File name: Distance.java
************/
import java.util.Scanner;


public class Distance//class name, file name
{// public is visibility modifiers // static non visibility // void retun type// main: method name // (String[] args) parameters: type: String type: args
   public static void main (String [] args){
      Scanner nums = new Scanner(System.in);
      double x1 = 0, y1 = 0, x2 = 0, y2 = 0, num1, num2, square;
      System.out.print("Enter x1: ");
      x1 = nums.nextDouble();
      
      System.out.print("Enter y1: ");
      y1 = nums.nextDouble();
      
      System.out.print("Exter x2: ");
      x2 = nums.nextDouble();
      
      System.out.print("Enter y2: ");
      y2 = nums.nextDouble();
      
      //double x1 = 1, x2 = 4, y1 = 2, y2 = 6, num1, num2, square;
      num1 = ((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))); 
      num2 = Math.sqrt(num1);
      System.out.println("Total before square root is " + (int)num1 + " distance is " + num2);
      
   }
}