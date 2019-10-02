import java.util.Scanner;
public class Week5{
   public static void main (String [] args){
      Scanner kbd = new Scanner(System.in);
      System.out.println(12 < 7 && 6>=6 || 5!=7);//precedence from left to right because there are no parenthesis
      System.out.println(12 < 7 && (6>=6 || 5!=7)); 
      System.out.println(12 < 7 || 6>=6 && 5!=7); 
      System.out.println(12 < 7 || 6 >= 6 && 5!=7);// and or && wins, not left to right
      System.out.print("Enter an integer: ");
      int num = kbd.nextInt();
      boolean isEven = num % 2 == 0;
      if (num % 2 == 0 || (isEven) || (isEven==true))// You can have a condition in the parenthesis or a variable like (isEven) or if (isEven==true) 
      {
         int num2 = num % 2;      
         System.out.println("Even ");
         System.out.println("not odd");
         System.out.println(num2);// num2 only has scoopr within the if statement local variable.
      }
      System.out.println("The End");
      if (isEven)
      {
         System.out.println("Even ");
         System.out.println("Not odd");// if the if statement only has one line of code then your do not need braces and the else statement could come immediatly after
      }
      else  //else condition statement
      {
         System.out.println("Odd");
      }
      System.out.print("Enter grade ");
      int grade = kbd.nextInt();// multiple if statements could lead to unwanted output. use of else is suggested
      if (grade >= 90)
         System.out.println("A");
      else if (grade >= 80)
         System.out.println("B");
      else if (grade >= 70)
         System.out.println("C");
      else if (grade >=60)
         System.out.println("D");
      else
         System.out.println("F");
   }
}