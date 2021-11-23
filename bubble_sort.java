public class bubble_sort
{
    static int q ;
    public static void main(){
        int a[] = new int []{1,54,8,2,33,6};

        for (int j=0;j<5;j++){
            for (int i=0;i<5;i++){
                if(a[i]>a[i+1]){

                    q=a[i];
                    a[i]=a[i+1];
                    a[i+1]=q ;

                }
            }  
        }

        //output
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}