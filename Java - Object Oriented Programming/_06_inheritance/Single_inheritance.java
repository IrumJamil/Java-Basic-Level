/*
Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
*/
package _06_inheritance;
public class Single_inheritance 
{
    public static void main(String[] args) 
    {
        B b=new B();
        b.a_class_function();
        b.b_class_function();
        
        Dog d=new Dog();
        d.walk();
        d.bark();
    }
}

class A // A class-  parent class, Super class, Base class
{
    int a=10;
    void a_class_function()
    {
        System.out.println("i am A class function");
    }
}
class B extends A // B class - Child class , Sub class, Derived class
{
    int b=20;
    void b_class_function()
    {
        System.out.println("i am B class function");
    }
}

// Another example

class Animal
{
    int age=10;
    void walk()
    {
        System.out.println(" Walking .............. ");
    }
}
class Dog extends Animal
{
    String color="brown";
    void bark()
    {
        System.out.println(" Barking ...............");
    }
}

/*
Inheritance in Java is a mechanism in which one object acquires 
all the properties and behaviors of a parent object.
- When you inherit from an existing class, you can reuse methods and fields of the parent class.
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

code reusability - is a mechanism which facilitates you to reuse the fields and methods of the 
                   existing class when you create a new class.

*/