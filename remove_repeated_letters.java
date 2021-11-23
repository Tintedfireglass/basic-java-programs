import java.util.Scanner;
public class remove_repeated_letters
{
   public static void main(){
    Scanner q = new Scanner(System.in);
    String str = q.next();
    int p = str.length();
    char c,ch;
    String st="";
    int t;
    for (int i=0 ; i<p ; i++){
        ch = str.charAt(i); t=0;
        for (int j=0 ; j<st.length() ; j++){
            c = st.charAt(j);
            if (ch==c){
              t=1;
            }
            }
            if (t==0){
            st=st+ch;
        }
    }
    System.out.println(st);
  }
}