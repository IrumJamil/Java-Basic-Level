package _12_abstract_class;
public class Abstract 
{
    public static void main(String[] args) 
    {
        My_Class3 m=new My_Class3();
        m.fun_1();
        m.fun_2();
    }
}

abstract class My_Class2{
    abstract void fun_1();
    void fun_2()
    {
        System.out.println("i am funtion 2");
    }
}
class My_Class3 extends My_Class2{
    void fun_1()
    {
        System.out.println("i am function 1");
    }
    
}

/*

A class which is declared with the abstract keyword is known as an abstract class in Java. 
It can have abstract and non-abstract methods (method with the body).

Abstraction is a process of hiding the implementation details and showing only functionality to the user.
for example, sending SMS where you type the text and send the message. 
You don't know the internal processing about the message delivery.

*/

/*

An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

*/