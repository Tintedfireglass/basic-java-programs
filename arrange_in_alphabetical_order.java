import java.util.Scanner;
public class arrange_in_alphabetical_order
{
    public static void main(){
        Scanner q = new Scanner(System.in);
        int p;
        System.out.println("enter a word");
        String str = q.nextLine();
        p=str.length();  
        str.toUpperCase();
        for(int i=65;i<=90;i++){
          for (int j=0;j<p;j++){
              char ch=str.charAt(j);
              if ((ch==(char)i)||(ch==(char)(i+32))){
              System.out.print(ch);
            }
            }  
            System.out.println("");
        }
    }
}
