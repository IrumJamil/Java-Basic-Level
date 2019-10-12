/*
If a class has multiple methods having 
- same name but different number of parameters - known as Method Overloading.
- Method overloading increases the readability of the program

There are two ways to overload the method in java
- By changing number of arguments
- By changing the data type
*/
package _10_polymorphism;
public class method_overloading 
{
    public static void main(String[] args) 
    {
        Calculator c=new Calculator();
        c.add(2, 2);
        c.add(2, 2,2);
        c.add(3.5,3.5);
    }
}
class Calculator
{
    void add(int a,int b)
    {
        int result=a+b;
        System.out.println("Result = "+result);
    }
    void add(int a,int b,int c) // same name - no of parameters different
    {
        int result=a+b+c;
        System.out.println("Result = "+result);
    }
    void add(double a,double b) // same name - same no of parameters but different data type
    {
        double result=a+b;
        System.out.println("Result = "+result);
    }
}
