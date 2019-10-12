package _06_inheritance;
public class Hierarchical 
{
    public static void main(String[] args) 
    {
        Z z=new Z();
        z.x_class_function();
        z.z_class_function();
        
        Y y=new Y();
        y.x_class_function();
        y.y_class_function();
    }
}

class X
{
    int x=10;
    void x_class_function()
    {
        System.out.println("i am X class function");
    }
}
class Y extends X
{
    int y=10;
    void y_class_function()
    {
        System.out.println("i am Y class function");
    }
}
class Z extends X
{
    int z=10;
    void z_class_function()
    {
        System.out.println("i am Z class function");
    }
}

// Another Example

class Animal3
{
    int age=10;
    void walk()
    {
        System.out.println(" Walking .............. ");
    }
}

class Dog2 extends Animal3
{
    String color="brown";
    void bark()
    {
        System.out.println(" Barking ...............");
    }
}
