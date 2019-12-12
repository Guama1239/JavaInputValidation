import java.util.Scanner;
public class Practice2Mytry
{
   public static void main(String[] args)
   {
      String[] fnames = {"John","Alice", "Cooper", "Pedrito","Rita"};
      String[] lnames = {"Chacon","Perez","Smith", "Contreras", "Ovalle"};
      long[] phones = {7734313420L, 3127196340L, 3121234321L, 7738285421L, 7732586458L};
      
      getNumber(fnames, lnames, phones);
   }
   
   public static void getNumber(String[] fnames, String[] lnames, long[] phones)
   {  
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Area Code?");
      int areaCode = kbd.nextInt();
      
      for (int i = 0; i < phones.length; i++)
         {
            if((phones[i])/10000000 == areaCode)
            {
               System.out.println(fnames[i] + " " + lnames[i] + " " + phones[i]);
            }
         }
   }
}