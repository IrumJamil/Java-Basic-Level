/*
- multiple inheritance is not supported in the case of class because of ambiguity. 
- it is supported in case of an interface because there is no ambiguity. 
- It is because its implementation is provided by the implementation class.
*/
package _11_interfaces;
public class Multiple_interface 
{
    public static void main(String[] args) 
    {
        MyClass1 m=new MyClass1();
        m.a1();
        m.b1();
        
        MyClass5 m1=new MyClass5();
        m1.print();
    }
}
interface A1{
    void a1();
}
interface B1{
    void b1();
}
class MyClass1 implements A1,B1
{
    public void a1()
    {
        System.out.println("i am functoin a1 and interface from A1");
    }
    public void b1()
    {
        System.out.println("i am functoin b1 and interface from B1");
    }
}

// Another Example

interface Printable1{  
    void print();  
}  
interface Showable1{  
    void print();  
}
class MyClass5 implements Printable1,Showable1
{
    public void print()
    {
        System.out.println("i am print function");
    }
}