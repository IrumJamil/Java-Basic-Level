package _01_Class_Object;
public class Simple_Class 
{
    int age=20; // variable - data member
    char grade='A';
    
    public static void main(String[] args)
    {
        Simple_Class object=new Simple_Class(); // we need to create an object of class for accesing 
                                             // all data members and member functions

        System.out.println(object.age);
        System.out.println(object.grade);
        
        object.show_function(); // simple function - memeber function
        object.show_roll_no(20); // function with paramater - passing argument
       
        
    }
    void show_function()
    {
        System.out.println("i am show function");
    }
    void show_roll_no(int roll)
    {
        System.out.println("My roll number is "+ roll);
    }
    
}
