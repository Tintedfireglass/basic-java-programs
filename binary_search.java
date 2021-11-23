import java.util.Scanner;
public class binary_search
{
    public static void main(){
        int min = 0;
        int max,n,mid;
        Scanner in = new Scanner(System.in);
        System.out.println("enter required number of aray length");
        n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter inputs for array");
        for (int a = 0 ;a<n ; a++){
            arr[a] = in.nextInt(); 
        }
        System.out.println("enter required number");
        int req = in.nextInt();
        max = n-1;
        while (min!=max){
            if (min+1==max){
                if (arr[min]==req){
                    System.out.println("the position of "+ req+ " is" + (min+1));
                    break;}
                else if(arr[max]==req) { System.out.println("the position of "+ req+ " is" + (max+1));
                    break;
                }
            }
            else{
                mid = max/2;
                if (arr[mid]==req){
                    System.out.println("the position of "+ req+ " is" + (mid+1));
                    break;
                }
                else if (arr[mid]>req){
                    max = mid;
                }
                else 
                    min = mid;
            }
        }
        if (min==max){
            if(arr[min]!=req)
                System.out.println("number not found");
            else
                System.out.println("the position of "+ req+ " is" + (min+1));
        }
    }
}