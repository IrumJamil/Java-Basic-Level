package _02_Constructor;
public class Constructor_Class 
{
    public static void main(String[] args)
    {
        Student1 s=new Student1(); // contructor call automatically when we create an object of class
        Student1 s1=new Student1("Ali"); // we can pass parameter - arugment in constructor
        Student1 s2=new Student1(20, 23);
        
        // constructor will not return anything
    }
}
class Student1
{
    Student1()
    {
        System.out.println("i am constructor"); // a function name same as class name - constructor
    }
    Student1(String name)
    {
        System.out.println("My name "+name);
    }
    Student1(int roll,int age)
    {
        System.out.println(roll+" and "+age);
    }
    
}

/*
There are two rules defined for the constructor.

- Constructor name must be the same as its class name
- A Constructor must have no explicit return type
- A Java constructor cannot be abstract, static, final, and synchronized

There are two types of constructors in Java:

- Default constructor (no-arg constructor)
- Parameterized constructor
*/