import java.util.Scanner;
public class array_in_out
{
   public static void main(){
       Scanner s= new Scanner(System.in);
       System.out.println("how many strings to enter?");
       int no = s.nextInt();
       String i[] = new String [no];
    for(int ct=0;ct<no;ct++){
     System.out.println("Enter a word");
     i[ct] = s.next();
     }
    for(int ct=0;ct<no;ct++){
         System.out.println("you entered "+i[ct]);
       }
 }
}