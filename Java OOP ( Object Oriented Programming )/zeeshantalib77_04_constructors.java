import java.util.Scanner;
class my_constructor
{
    public static void main(String args[])
    {
        zeeshan1 zee_object = new zeeshan1("Zeeshan");
        zeeshan1 zee_object2 = new zeeshan1("Talib");
        zee_object.saying();
        zee_object2.saying();
    }
}
class zeeshan1 
{
    private String girlName;
    public zeeshan1(String name)
    {
        girlName=name;
    }
    public String getName()
    {
        return girlName;
    }
    public void saying(){
        System.out.printf("Your name is %s ", getName());
    }
}