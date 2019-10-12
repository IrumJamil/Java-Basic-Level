package _05_encapsulation;
public class Encapsulation 
{
    public static void main(String[] args)
    {
        Student2 s=new Student2();
        System.out.println("age is public = "+s.age);
        s.show_age();
        
        s.set_roll_no(30);
        s.get_roll_no();
        
    }
}
class Student2
{
    public int age=20;
    public void show_age()
    {
        System.out.println("My age = "+age);
    }
    
    private int roll_no; // private variables can not be acessed from outside the class so we need getter and setter functoin
    public void set_roll_no(int roll)
    {
        this.roll_no=roll;
    }
    public void get_roll_no()
    {
        System.out.println("Roll no = "+this.roll_no);
    }
    
}