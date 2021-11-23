import java.util.Scanner;
public class ASCII_finder
{
   public static void main(){
       Scanner q = new Scanner(System.in);
       System.out.print("enter a symbol.");
       System.out.println("If you enter many only the first will be taken");
       String inp = q.next();
       char in = inp.charAt(0);
       int ascii = (int)in;
      System.out.println("the ASCII value is "+ascii);
    }
}
