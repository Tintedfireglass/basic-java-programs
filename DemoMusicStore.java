import java.util.Scanner;
class repair{

    String cname , iname , issue ; 
    long phno;
    void disp(){
        System.out.println("your order is confirmed");
    }

}class instrument{

    void veena(){
        String[] model = { "model1","model2"};
        long[] price = { 10000,1000};
        for(int i=0;i<=1;i++)
            System.out.println(model[i] + price[i]);

    }

    void guitar(){
        String[] model = { "model1","model2"};
        long[] price = { 99999,9976};
        for(int i=0;i<=1;i++)
            System.out.println(model[i] + price[i]);
    }

}
public class DemoMusicStore
{
    public static void main(){
        System.out.println("Do u like to have a purchase or support");    
        Scanner in = new Scanner(System.in);
        String choice = in.next();
        repair rep = new repair();
        instrument inst  = new instrument();

        if ( choice.equals("purchase"))
        {   
            System.out.println("Do you want a veena or a guitar");
            String type = in.next();
            if (type.equals("guitar")){
                inst.guitar();

            }
            else if (type.equals("veena")){
                inst.veena();

            }
        }
        else if (choice.equals("support"))
        {
            System.out.println("enter name");
            rep.cname = in.next();
            System.out.println("enter instrument name");
            rep.iname = in.next();
            System.out.println("type your issue");
            rep.issue = in.nextLine();
            System.out.println("please enter your mobile number");
            rep.phno = in.nextLong();
            rep.disp();
        }
    }
}
