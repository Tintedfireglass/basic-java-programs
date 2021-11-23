import java.util.Scanner;
public class palindrome
{   
   public static void main(){
       Scanner q = new Scanner(System.in);
      int a = q.nextInt();
      int aa=  rev(a);
       if (aa==a)
         System.out.println("palindrome");
       else  System.out.println("not palindrome");
    }
  public static int rev(int a ){
      int ans=0;
      while(a>0){
        int w = a%10;
        a =a/10;
       ans = 10*ans +w ;
        
    }
    return(ans);
   }
}

 