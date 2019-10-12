/*
A static class i.e. created inside a class is called static nested class in java
A static inner class is a nested class which is a static member of the outer class
It can be accessed without instantiating the outer class, using other static members
*/
package _04_nested_classes;
public class static_nested_class 
{
    public static void main(String[] args) 
    {
        Outer_Class1.Inner_Class1 obj=new Outer_Class1.Inner_Class1();
        obj.message();
        
        Outer_Class1.Inner_Class1.message1(); // accesing static member
    }
}

class Outer_Class1 
{
   static int data=10;
   static class Inner_Class1 
   {
      void message() 
      {
         System.out.println("static data = "+data);
      }
      static void message1()
      {
          System.out.println("this is static message - no need to make an object for its calling");
      }
   }
}