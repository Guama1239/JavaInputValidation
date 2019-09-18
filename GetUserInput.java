/****************
* Luis Rosales
* CS200
* Fall 2019**/

import java.util.Scanner; //1st line of code in program

public class GetUserInput
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      String firstName, restOfName;
      int age;
      System.out.print(" What is your name?: ");
      //firstName = kbd.next();
      restOfName = kbd.nextLine();
      System.out.print("Enter your age: ");
      age = kbd.nextInt();
      System.out.print("Enter 2 integers: ");
      int num1 = kbd.nextInt();
      int num2 = kbd.nextInt();
      int sum = num1 + num2;
      System.out.println(); //This line prints an empty line
      //System.out.println("First name: " + firstName);
      //System.out.println("Rest of name: " + restOfName);
      System.out.println("Full Name: " + restOfName);
      System.out.println("Your age: " +age + " years old");
      System.out.println(num1 + " + " + num2 + " = " + sum);
   } 
}