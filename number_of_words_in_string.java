
import java.util.Scanner;
public class number_of_words_in_string
{
  public static void main(){
    Scanner q = new Scanner(System.in);
    System.out.println("enter a sentence");
    String str = q.nextLine();
    int words = 0;
    for (int ct=1 ; ct<=(str.length()-1);ct++){
        if (str.charAt(ct)!=' '){
            words=1;
            break;
        }
    }
    for (int ct=1 ; ct<=(str.length()-1);ct++){
      if (str.charAt(ct)==' '){
            if (str.charAt(ct-1)!=' '){
                words++;
            }
        }
    }
    if ((str.charAt(str.length()-1))==' '){
        words--;
    }
    
    System.out.println("the number of words are "+words);
  }
}
