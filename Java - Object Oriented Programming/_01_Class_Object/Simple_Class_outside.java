package _01_Class_Object;
public class Simple_Class_outside 
{
    public static void main(String[] args)
    {
        // object of same class
        Simple_Class_outside os=new Simple_Class_outside();
        os.my_function();
        
        // object of another class
        Student s=new Student();
        s.show_student();
        System.out.println(s.roll_no);
       
    }
    void my_function()
    {
        System.out.println("this is my functoin");
    }
}
class Student
{
    int roll_no=20;
    void show_student()
    {
        System.out.println("i am a student");
    }
}