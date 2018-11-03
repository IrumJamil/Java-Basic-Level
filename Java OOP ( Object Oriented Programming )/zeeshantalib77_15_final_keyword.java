class final_keyword 
{
    public static void main(String[] args)
    {
        zeeshan15 zeeshan15_object = new zeeshan15(10);
        
        for(int i=0; i<5;i++)
        {
            zeeshan15_object.add();
            System.out.printf("%s", zeeshan15_object);
        }
    }
}
 class zeeshan15 
{
    private int sum;
    private final int NUMBER;
    
    public zeeshan15(int x)
    {
        NUMBER = x;
    }
    public void add()
    {
        sum+=NUMBER;
    }
    public String toString()
    {
        return String.format("sum = %d\n", sum);
    }

}