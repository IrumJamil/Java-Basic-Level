class objects_for_constructors 
{
    public static void main(String[] args)
    {
        zeeshan16 zee_object = new zeeshan16();
        zeeshan16 zee_object1 = new zeeshan16(5);
        zeeshan16 zee_object2 = new zeeshan16(5,13);
        zeeshan16 zee_object3 = new zeeshan16(5,13,43);
        
        System.out.printf("%s\n", zee_object.toMilitary());
        System.out.printf("%s\n", zee_object1.toMilitary());
        System.out.printf("%s\n", zee_object2.toMilitary());
        System.out.printf("%s\n", zee_object3.toMilitary());
    }

}
class zeeshan16
{
    private int hour;
    private int minute;
    private int second;
    
    public zeeshan16()
    {
        this(0,0,0);
    }
    public zeeshan16(int h)
    {
        this(h,0,0);
    }
    public zeeshan16(int h, int m)
    {
        this(h,m,0);
    }
    public zeeshan16(int h, int m, int s)
    {
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h)
    {
        hour = ((h>=0 && h<24)?h:0);
    }
    public void setMinute(int m)
    {
        minute = ((m>=0 && m<60)?m:0);
    }
    public void setSecond(int s)
    {
        second = ((s>=0 && s<60)?s:0);
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public String toMilitary()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}