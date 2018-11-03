class staic_keyword 
{
    public static void main(String[] args){
        zeeshan13 member1 = new zeeshan13("Zeeshan", "Talib");
        zeeshan13 member2 = new zeeshan13("Ali", "Hamza");
        zeeshan13 member3 = new zeeshan13("Arslan", "Khan");
    }

}

class zeeshan13 
{
    private String first;
    private String last;
    private static int members = 0; 
    
    public zeeshan13(String fn, String ln)
    {
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club : %d\n", first, last, members);
    }
}