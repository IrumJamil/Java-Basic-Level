package _07_access_modifiers;
public class public_keyword 
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        System.out.println(s.age +" "+ s.name); // public data member accessible from outside of class
        s.show_information(); // public member functoin acsessible from outside of class 
        
    }
}
class Student
{
    public String name="Ali"; // public data member - can be accessed both inside and outside of class
    public int age=20;
    public void show_information() // public member function - can be accessed both inside and outside of class
    {
       System.out.println(this.age +" "+ this.name);
    }
}
/*
- Public: The access level of a public modifier is everywhere.It can be accessed from 
          within the class, outside the class, within the package and outside the package.
- Private: The access level of a private modifier is only within the class.
- Protected: The access level of a protected modifier is within the 
           package and outside the package through child class.
- Default: If you don't use any modifier, it is treated as default by default.
The default modifier is accessible only within package. 
It cannot be accessed from outside the package. 
It provides more accessibility than private. But, it is more restrictive than protected, and public.

*/
