
package _04_nested_classes;
public class inner_class_2 
{
    public static void main(String[] args) 
    {
        Outer_Class2 outer=new Outer_Class2();
        outer.dispaly_inner();;
    }
}

class Outer_Class2 
{
   int n;
   private class Inner_Class2
   {
      void print()
      {
          System.out.println("this is inner provate class - function");
      }
   }
   
   void dispaly_inner()
   {
       Inner_Class2 i=new Inner_Class2();
       i.print();
   }
}