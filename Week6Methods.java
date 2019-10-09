import java.util.Scanner;
public class Week6Methods{

   public static int askForGrade()//no parameters. we are going to create the scanner here instead of main
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter integer grade: ");
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

   public static void main (String [] args){
      int grade = askForGrade();
      //Scanner kbd = new Scanner(System.in);
      //System.out.print("Enter an integer grade ");
      //int grade = kbd.nextInt();
      char letterGrade = getLetterGrade(grade);
      printGrade(letterGrade, grade);
       
   }
}

