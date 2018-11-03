import java.util.Scanner;
class methods_and_instances
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        zeeshan5 zee_object = new zeeshan5();
        System.out.println("Enter name of first gf here: ");
        String my_name = input.nextLine();
        zee_object.setName(my_name);
        zee_object.saying();
    }
}
class zeeshan5 
{
    private String girlName;
    public void setName(String name)
    {
        girlName=name;
    }
    public String getName()
    {
        return girlName;
    }
    public void saying()
    {
        System.out.printf("Your first gf was %s", getName());
    }
}