/*
Java inner class or nested class is a class which is declared inside the class or interface
- We use inner classes to logically group classes and interfaces in one place 
  so that it can be more readable and maintainable.

- Nested classes are used to develop more readable and maintainable code 
  because it logically group classes and interfaces in one place only.
*/
package _04_nested_classes;
public class inner_class 
{
    public static void main(String[] args)
    {
        Outer_Class outer=new Outer_Class();
        Outer_Class.Inner_Class inner=outer.new Inner_Class();
        
        System.out.println(outer.x+ inner.y); // Answer = 30
        inner.show();
    }
}
class Outer_Class
{
    int x=10;
    
    class Inner_Class
    {
        int y=20;
        void show()
        {
            System.out.println("i am show function");
        }
    }
}

/*
1) Non-static nested class (inner class)
 - Member inner class
 - Anonymous inner class
 - Local inner class
2) Static nested class
*/