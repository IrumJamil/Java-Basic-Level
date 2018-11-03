import java.util.EnumSet;
class enum_set_range
{
    public static void main(String[] args){
        for(zeeshan10 people: zeeshan10.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
                
        System.out.println("\nAnd now fpr the range of constants!!!\n");
        
        for(zeeshan10 people: EnumSet.range(zeeshan10.kelsey, zeeshan10.candy))
        System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}

enum zeeshan10 {
    bucky("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12"),
    nicole("italian", "13"),
    candy("different", "14"),
    erin("iwish", "16");
    
    private final String desc;
    private final String year;
    
    zeeshan10(String description, String birthday){
        desc = description;
        year = birthday;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getYear(){
        return year;
    }

}