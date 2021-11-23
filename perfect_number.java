import java.util.Scanner;

public class perfect_number
{    
   
    public static void main(String[] args) 
    {
         int l=0 , s=0 ;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        l = z.nextInt();
        for(int i = 1; i <l ; i++)
        {
            if(l % i == 0)
            {
                s=s+i;
            }
        }
        if(s==l)
        {
        
            System.out.println("Perfect");
        
        }
        else
        {
        
            System.out.println("Not Perfect");
        
        }
    }
        
}
