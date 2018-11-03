class enumeration_class 
{
    public static void main(String[] args)
    {
        for(zeeshan8 people: zeeshan8.values())            
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}
enum zeeshan8 
{
    zeeshan("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12");
    
    private final String desc;
    private final String year;
    
    zeeshan8(String description, String birthday)
    {
        desc = description;
        year = birthday;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getYear()
    {
        return year;
    }
}