class Enhanced_loop
{
    public static void main(String[] args)
    {
        int bucky[]={3,4,5,6,7};
        int total=0;
        for(int x: bucky)
        {
            System.out.println(x);
            total+=x;
        }
        System.out.println("Total ="+total);
    }
}