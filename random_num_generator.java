 import java.util.Scanner;
public class random_num_generator
{
    public static void main()
    { Scanner q = new Scanner(System.in);
        System.out.println("enter lower value in integers");
        int n1 = q.nextInt();
        System.out.println("enter higher value in integers");
        int n2 = q.nextInt();  
        System.out.println(Math.random()*(n1-n2)+n2);       
    }
}
