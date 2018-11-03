class more_on_static
{
    public static void main(String[] args){
        zeeshan14 member1 = new zeeshan14("Zeeshan", "Talib");
        zeeshan14 member2 = new zeeshan14("Ali", "hamza");
        zeeshan14 member3 = new zeeshan14("Arslan", "Khan");
         
        System.out.println();
        System.out.println(zeeshan14.getMembers());
        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers()); 
    }
}

class zeeshan14 
{
    private String first;
    private String last;
    private static int members = 0; 
    
    public zeeshan14(String fn, String ln)
    {
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club : %d\n", first, last, members);
    }
    public String getFirst()
    {
        return first;
    }
    public String getLast()
    {
        return last;
    }
    public static int getMembers()
    {
        return members;
    }
}