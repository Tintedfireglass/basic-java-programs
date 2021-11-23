import java.util.Scanner;
public class prime
{
    public static int check(int n){
        int a,x=0,c=0;
        for   (a=1;a<=n;a++){
         if   (n%a==0){
               c++;
                }
          }
        if (c==2){
            x=1;
            return(x);
           }
        else {
           x=0;    
           return(x);
        }
    }
    public static void main(){
        Scanner q = new Scanner(System.in);
        System.out.println("enter a number");
        int pr = q.nextInt();
        int is = check(pr);
        if (is==1)
        System.out.println("prime");
        else
        System.out.println(" not prime");
    }
}