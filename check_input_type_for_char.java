
import java.util.Scanner;
public class check_input_type_for_char
{
  public static void main(){
      Scanner q  = new Scanner(System.in);
      System.out.print("enter a single character. ");
       System.out.print("if you type more than 1 character ,  ");
         System.out.println("only the first character will be taken");
      char a = q.next().charAt(0);   
      boolean var = Character.isLetter(a);
      boolean num = Character.isDigit(a);
      if (var==true){
        System.out.println("you entered a letter");
        }
      else if(num==true) {
          System.out.println("you entered a number");
        }
        else {
            System.out.println("you entered a symbol");
        }
    }
}
