import java.util.*;
public class sort_2
{
    public static void main(){

        int a[]= new int []{1,2,3,4,5,6,7,8,9,10,0};

        Scanner sc = new Scanner(System.in);
        System.out.println("no 0- 10");
        int no = sc.nextInt();
        for(int i=9;i>no-1;i--){

            a[i+1]=a[i];

        }
        a[no]=100;

        for(int j=0;j<11;j++){

            System.out.println(a[j]);

        }

    }
}
