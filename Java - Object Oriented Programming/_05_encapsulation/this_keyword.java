package _05_encapsulation;
public class this_keyword 
{
    public static void main(String[] args) 
    {
        
    } 
}

class Student3
{
    public int age=20;
    public int roll_no=12;
    public void show_age()
    {
        // this keyword - current class object - accessing elements within the class 
        System.out.println("My age = "+this.age); 
        System.out.println("My roll no is "+this.roll_no);
        this.function();
    }
    public void function()
    {
        System.out.println("this is functoin");
    }
}
/*
this is a reference variable that refers to the current object

- this can be used to refer current class instance variable.
- this can be used to invoke current class method (implicitly)
- this() can be used to invoke current class constructor.
- this can be passed as an argument in the method call.
*/