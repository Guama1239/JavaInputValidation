/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS7 Methods and Conditions Problem 2 due 10/23/2019
* File name: Ws7evenOdd.java
************/


 import java.util.Scanner; 
 public class Ws7evenOdd
 {
   public static void main(String[] args)  {
      Scanner kbd = new Scanner(System.in);
  
      System.out.print("Enter and integer: ");
      int num = kbd.nextInt(); 
  
      if(num > 0){
          if(num % 2 == 1){
               System.out.println(num + " is not even");
          } 
           System.out.println(num + " is not negative");  }
      
      else{
          if(num % 2 == 1){
               System.out.println(num + " is not even");    
          }
          else{
               System.out.println(num  + " is even and negative");
          }
      }
   }
}	