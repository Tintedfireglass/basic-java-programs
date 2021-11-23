import java.io.*;
public class Area
{
    public void Triangle(double b,double h)
    {
        double area = 0.5*b*h;
         System.out.println("Area of Triangle equals to"+area);
    }
    public void Square(double a)
    {
        double area= a*a;
        System.out.println("Area of Square equals to"+area);
    }
    public void Rectangle(double l, double b)
    {
         double area = l*b;
        System.out.println("Area of Rectangle equals to"+area);
    }
    public void main() throws IOException
    {
        int ch;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1-For area of Triangle");
        System.out.println("2-For area of Square");
        System.out.println("3-For area of Rectangle");
        for(int i=1;i<=4;i=i+1)
        {ch=Integer.parseInt(buf.readLine());
        switch(ch)
        {
            case 1:
            Triangle(10,6);
            break;
            case 2:
            Square(25);
            break;
            case 3:
            Rectangle(10,5);
            break;
            default:
            System.out.println("Wrong choice please select between 1 and 3");}
        }}}