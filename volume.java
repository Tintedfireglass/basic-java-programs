class volume
{
    public void vol(int side)
    {
        int area=side*side*side;
        System.out.println("area of the cube="+area);
    }

    public void vol(int l,int b,int h)
    {
        int are=l*b*h;
        System.out.println("area of the cuboid ="+are);
    }

    public void vol(double r)
    {
        double sp=4.0/3*3.14*r*r*r;
        System.out.println("area of the sphere="+sp);
    }

    public static void main()
    {
        volume ob = new volume();
        ob.vol(4);
        ob.vol(2,4,3);
        ob.vol(2.0);
}
}