package _01_Class_Object;
public class Simple_Class_more 
{
    int value=10;
    String univeristy="Superior";
    
    public static void main(String[] args)
    {
        Simple_Class_more object=new Simple_Class_more(); // we need to create an object of class for accesing 
                                             // all data members and member functions
        System.out.println(object.value);
        System.out.println(object.univeristy);
        
        object.show_name("Ali");
        object.show_complete_name("Ahmad", "Raza"); // function with multiple parameters
        object.show_record(40, 20, (float)3.5);
    }
    void show_name(String name)
    {
        System.out.println("My name is "+name);
    }
    void show_complete_name(String fname,String lname)
    {
        System.out.println("My complete name "+ fname +" "+lname);
    }
    void show_record(int reg_no, int roll_no,float cgpa)
    {
        System.out.println("Registration = "+reg_no+" Roll No = "+roll_no+" CGPA = "+cgpa);
    }
}
