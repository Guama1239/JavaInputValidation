/****************
* Luis Rosales
* CS200
* Fall 2019
* Problem 1 SumSpaced.java
* Due 09/11/2019
***************/
import java.util.Scanner; //1st line of code in program

public class SumSpaced //
{//public is visibility modifiers // static non visibility modifier // void return type // main: method name // (String[] args) parameters: type: String type: args
   public static void main(String[] args)
   {  
      Scanner nums = new Scanner(System.in);
      System.out.print("Enter two integers: ");
      
      int num1 = nums.nextInt();
      int num2 = nums.nextInt();
      int mul = num1 * num2;
      int sum = num1 + num2;
      
      System.out.println("You entered: " + num1 + " and "+ num2);
      System.out.println("The product is " + mul);
      System.out.print("The sum is " + sum);
      
   }
}
/*******************************
MULTI
LINE COMMENT
****************************/
