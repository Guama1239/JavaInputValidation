/****************
* Luis Rosales
* CS200
* Fall 2019
* Problem 1 SumSpaced.java
* Due 09/18/2019
***************/
import java.util.Scanner; //1st line of code in program

public class SumSpacedSep11 //
{//public is visibility modifiers // static non visibility modifier // void return type // main: method name // (String[] args) parameters: type: String type: args
   public static void main(String[] args)
   {  
      Scanner kbd = new Scanner(System.in);
      String fullName;
      System.out.println("What is your name?  ");
      fullName = kbd.nextLine();
      System.out.println("Enter two integers ");
      int num1 = kbd.nextInt();
      int num2 = kbd.nextInt();
      int mul = num1 * num2;
      int sum = num1 + num2;
      System.out.println("Hi " + fullName + " You entered: " + num1 + " and "+ num2);
      System.out.println(" ");
      System.out.println("The product is " + mul);
      System.out.print("The sum is " + sum);
      
   }
}
/*******************************
MULTI
LINE COMMENT
****************************/
