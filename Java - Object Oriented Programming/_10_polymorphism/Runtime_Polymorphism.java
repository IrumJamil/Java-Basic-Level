/*
Polymorphism in Java is a concept by which we can perform - a single action in different ways
Greek words: poly and morphs - word "poly" means many and "morphs" means forms

two types of polymorphism in Java: 
- compile-time polymorphism (e.g; overload a static method in Java)
- runtime polymorphism

We can perform polymorphism in java by method overloading and method overriding.

Runtime polymorphism or Dynamic Method Dispatch is a process 
in which a call to an overridden method is resolved at runtime rather than compile-time.
In this process, an overridden method is called through the reference variable of a superclass

Upcasting: If the reference variable of Parent class refers to the object of Child class
*/
package _10_polymorphism;
public class Runtime_Polymorphism 
{
    public static void main(String[] args) 
    {
        Bike b=new Honda(); // upcasing - reference variable of Parent class refers to the object of Child class
        b.run();
        
        A5 a=new B5();//upcasting - reference variable of Parent class refers to the object of Child class
    }
}
class Bike{ // Bike - parent class
    void run(){System.out.println("Bike is running");};
}
class Honda extends Bike{ // Honda - child class
    void run(){System.out.println("Honda bike is running");};
}

class A5{
}  
class B5 extends A5{    
}  

