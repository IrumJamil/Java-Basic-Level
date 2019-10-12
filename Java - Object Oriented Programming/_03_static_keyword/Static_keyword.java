package _03_static_keyword;
public class Static_keyword 
{
    public static void main(String[] args) 
    {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter.fun(); // static method - no need to create object for calling but class name
        System.out.println(Counter.age);
    }
}
class Counter
{
    static int count=0;
    static int age=10;
    Counter()
    {
        count++;
        System.out.println(count);
    }
    
    static void fun()
    {
        System.out.println("i am functoin");
    }
}

/*
The static keyword in Java is used for memory management mainly. 
We can apply java static keyword with variables, methods, blocks and nested class.
It makes your program memory efficient (i.e., it saves memory).

- Variable (also known as a class variable)
- Method (also known as a class method)
- Block
- Nested class

The static variable can be used to refer to the common property of all objects 
static variable will get the memory only once and shared
*/