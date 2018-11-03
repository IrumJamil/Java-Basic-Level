class composition 
{
    public static void main (String[] args)
    {
        time time_object = new time(4,5,6);
        date_of_birth date_object = new date_of_birth("Bucky", time_object);
        
        System.out.println(date_object);
    }
}

class date_of_birth
{
    private String name;
    private time birthday;
    
    public date_of_birth(String theName, time theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString()
    {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}

class time 
{
    public int month;
    public int day;
    public int year;
    
    public time(int m, int d, int y)
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