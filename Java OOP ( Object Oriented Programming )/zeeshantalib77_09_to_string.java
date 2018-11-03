class  to_string
{
    public static void main (String[] args){
        zeeshan7 zee_object = new zeeshan7(4,5,6);
    }
}
class zeeshan7 
{
    public int month;
    public int day;
    public int year;
    public zeeshan7(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}