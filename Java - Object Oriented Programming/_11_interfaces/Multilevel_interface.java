package _11_interfaces;
public class Multilevel_interface 
{
    public static void main(String[] args) 
    {
        MyClass2 m=new MyClass2();
        m.c1_function();
        m.d1_function();
    }
}

interface C1
{
    void c1_function();
}
interface D1 extends C1 // keyword: extends (interface-interface)
{
    void d1_function();
}
class MyClass2 implements D1 // keyword: implements (class-interface)
{
    public void c1_function()
    {
        System.out.println("i am functoin c1 and interface from C1");
    }
    public void d1_function()
    {
        System.out.println("i am functoin d1 and interface from D1");
    }
}