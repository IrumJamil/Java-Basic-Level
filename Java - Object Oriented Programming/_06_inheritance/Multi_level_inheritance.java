package _06_inheritance;
public class Multi_level_inheritance 
{
    public static void main(String[] args) 
    {
        E e=new E();
        e.c_class_function();
        e.d_class_function();
        e.e_class_function();
        
        Kitten2 k=new Kitten2();
        k.walk();
        k.meow();
        k.cute();

    }
    
}

class C
{
    int c=10;
    void c_class_function()
    {
        System.out.println("i am C class function");
    }
}
class D extends C
{
    int d=10;
    void d_class_function()
    {
        System.out.println("i am D class function");
    }
}
class E extends D
{
    int e=10;
    void e_class_function()
    {
        System.out.println("i am E class function");
    }
}

// Another Example

class Animal2
{
    int age=10;
    void walk()
    {
        System.out.println(" Walking .............. ");
    }
}
class Cat2 extends Animal2
{
    String color="brown";
    void meow()
    {
        System.out.println(" Meooooow ..............");
    }
}
class Kitten2 extends Cat2
{
    String name="little cato";
    void cute()
    {
        System.out.println(" So cute ...............");
    }
}