import java.util.Scanner;
public class check_palindrome_word
{
    public static void main(){
        Scanner q = new Scanner(System.in);
        System.out.println("enter a number");
        StringBuffer str =new StringBuffer(q.nextLine());       
        if (str==(str.reverse())){
            System.out.println("it is a palindrome");
        }
        else
        System.out.println("it is not a palindrome");
    }
}
