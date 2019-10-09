import java.util.Scanner;
public class Week6Methods1{

   public static int getInput()//no parameters. we are going to create the scanner here instead of main
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a number: ");
      return kbd.nextInt();
   }
   
   public static void printGrade(char letter, int num)
   {
      System.out.println(num + ": " + letter);
   }

   public static char getLetterGrade(int num)
   {
      char letter;
      if (num >= 90)
      return 'A';
      else if (num >= 80)
      return 'B';
      else if (num >= 70)
      return 'C';
      else 
      return 'F';// adding this else ensures a return regardless.
   }

   public static void print (int num1, int num2, int result, boolean addition)
   {
      if (addition)
      {
         System.out.println(num1 + " +" + num2 + " = " + result);
      }
      else
      {
         System.out.println(num1 + " - " num2 + " = " + result);
      }
   }
   public static void main (String [] args){
      int one = getInput();
      int two = getInput();
      int sum = add(one, two);
      int diff = subtract(one, two);
      print(one, two, sum, true);
      print(one. two, diff, false);
       
   }
}

//i could not copy the whole program, so ask someone for the rest!!