package _11_interfaces;
public class Simple_interface 
{
     public static void main(String[] args) 
    {
       MyClass3 m=new MyClass3();
       m.my_function();
    }
    
}

interface I_my_interface
{
    void my_function();
}
class MyClass3 implements I_my_interface
{
    public void my_function()
    {
        System.out.println("i am my functoin and interface from A1");
    }
}

/*

An interface in java is a blueprint of a class. It has static constants and abstract methods.

- class extends another class
- interface extends another interface
- class implements an interface.

Java Interface also represents the IS-A relationship.

- There can be only abstract methods in the Java interface, not method body. 
- It is used to achieve abstraction and multiple inheritance in Java.

- It is used to achieve abstraction.
- By interface, we can support the functionality of multiple inheritance.
- It can be used to achieve loose coupling.
*/