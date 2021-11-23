import java.util.*;

public class array_3
{   public  void array(){

        int q[]=new int[9];
        Scanner sc=new Scanner(System.in);

        for (int i =0;i<9;i++){

        
            System.out.println("int "+i);
            q[i] = sc.nextInt();

        }
        for (int j =0;j<9;j++){

        
            System.out.println(q[j]);

        }
    
    }

    public static void main(){
        array_3 ob = new array_3();
        ob.array();

    }
}