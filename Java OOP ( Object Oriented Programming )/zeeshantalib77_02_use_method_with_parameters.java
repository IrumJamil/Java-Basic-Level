import java.util.Scanner;
class method_with_parameters
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        zeeshan zee_object = new zeeshan();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        zee_object.simple_message(name);
    }
}
class zeeshan
{
    public void simple_message(String name)
    {
        System.out.println("Hello " + name);
    }
}