import java.util.*;

public class add
{
    public static void main () {
        
        add ob = new add();
        ob.a();

    }

    public  void a () {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("sum = "+c);
    }

}
