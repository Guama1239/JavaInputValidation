public class Practice5
{
   public static void main (String[] args)
   {
      
      
      System.out.println(canDoRoundTrip(90,120,true));  
   }
   public static boolean canDoRoundTrip(int percent, int miles, boolean cold)
   {
      boolean trip = true; int battery = 45000;
      battery = (battery*percent)/100;
      System.out.println("Percentage of Charge: "+percent+"; KW: "+(double)battery);
      if (!cold)
         percent = (battery * 90)/100;
      else 
         percent = (battery * 80)/100;
      System.out.println("Total Miles for round trip: " + miles*2 );
      System.out.println("Total Miles available: " + (double)(percent/150));
      if ((miles*2)>(percent/150))
         trip = false;
      return trip;
   }
}