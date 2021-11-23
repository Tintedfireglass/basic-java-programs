import java.util.Scanner;
public class selsort
{
   public static void main()
   {   Scanner q = new Scanner(System.in);
       System.out.println("enter no of terms in list");
       int n = q.nextInt();
       int arr[] = new int[n];
       System.out.println("enterterms");
       for ( int i =0 ; i < n ; i++)
         arr[i] = q.nextInt();
       int start=0,min=0;
       int temp;
       while(start<n-1){
       for ( int a = start ; a<n-1 ; a++){
           min = start;
           if (arr[min]>arr[a+1])
           min = a+1;
             }
       temp = arr[start];
       arr[start]= arr[min];
       arr[min]=temp;
       start++;
   }
    for ( int i =0 ; i < n ; i++)
        System.out.println(arr[i]);
  
}
}