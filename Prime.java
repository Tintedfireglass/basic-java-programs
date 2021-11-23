import java.util.Scanner;

public class Prime {
        public static void main(String[] args) 
        {
                 int i, n, z = 0; 
            var sc = new Scanner(System.in);
            
            System.out.print("Enter no: ");
            n =sc.nextInt();        
        
        for (i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                z++;
                break;
            }    
        }
        if(z == 0 && n != 1 )
        {
            System.out.println( "Prime");
        }
            else
        {
           System.out.println("Not Prime");
        }
    }
}