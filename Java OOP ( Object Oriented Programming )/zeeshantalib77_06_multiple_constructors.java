class zeeshan11 
{
    private int hour;
    private int minute;
    private int second;
    
    public zeeshan11()
    {
        this(0,0,0);
    }
    public zeeshan11(int h)
    {
        this(h,0,0);
    }
    public zeeshan11(int h, int m)
    {
        this(h,m,0);
    }
    public zeeshan11(int h, int m, int s)
    {
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s)
    {
       this.hour=h;
       this.minute=m;
       this.second=s;
    }

}
