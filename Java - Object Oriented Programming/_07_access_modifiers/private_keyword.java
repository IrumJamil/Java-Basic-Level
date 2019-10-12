package _07_access_modifiers;
public class private_keyword 
{
    public static void main(String[] args) 
    {
        Student1 s=new Student1();
        // s.fun_private(); // private memeber function can't be acessed from outside of class
        // s.name; // private data member - can't be acessed from outside of class
   }
}
class Student1
{
    private String name="Ali";
    private void fun_private() // private - only accessed inside of class - not outside
    {
        System.out.println("this is private function");
    }
}

/*
- private access modifier is accessible only within the class.
how to use private vairables and functoins - See Encapsulation 

*/