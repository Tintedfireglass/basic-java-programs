import java.util.Scanner;
public class ascending_bubble_sort
{public static void main(){
       int min,start=0;
            int temp;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("enter count of numbers");
      int n = scan.nextInt();
      int ar[] = new int [n];
      System.out.println("enter numbers");
      for (int a=0;a<n;a++)
      {
          ar[a]=scan.nextInt();
    }
    for(int x=0;x<n-1;x++){
          min=start;
        for (int a=start;a<n-1;a++)
      {      
          if (ar[min]>ar[a+1])
          { temp=ar[min];
              ar[min]=ar[a+1];
              ar[a+1]=temp ; 
            }
     } 
        
        start++;
   }
     for (int a=0;a<n;a++)
      {
          System.out.println(ar[a]);
    }
}
}
