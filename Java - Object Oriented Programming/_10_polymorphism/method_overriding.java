/*
If subclass (child class) has the same method as declared in the parent class - known as method overriding in Java.
- Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
- The method must have the same name as in the parent class
- The method must have the same parameter as in the parent class.
- There must be an IS-A relationship (inheritance).
*/
package _10_polymorphism;
public class method_overriding 
{
    public static void main(String[] args) 
    {
        Animal2 animal=new Animal2();
        Cat2 cat=new Cat2();
        Kitten2 kitten=new Kitten2();
        
        animal.run();
        cat.run();
        kitten.run();
    }
}
class Animal2
{
    void run(){ System.out.println("animal is running");}
}
class Cat2 extends Animal2
{
    void run(){ System.out.println("cat is running");}
}
class Kitten2 extends Cat2
{
    void run(){ System.out.println("kitten is running");}
}
