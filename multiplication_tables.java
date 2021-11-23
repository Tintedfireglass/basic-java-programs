
import java.util.Scanner;
public class multiplication_tables
{
   public static void main()
   {  Scanner i = new Scanner(System.in);
       System.out.println("input the number whose table you want");
       int table = i.nextInt();
       System.out.println("how many tables do you want");
       int times = i.nextInt();
      for (int lp = 0 ; lp<=times ; lp++)
      {   int a = table*lp ; 
          System.out.println(table+" x "+lp+" = "+a);
      }
   }
}
