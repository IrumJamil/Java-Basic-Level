package _04_nested_classes;
public class method_local_inner_class 
{
    public static void main(String[] args) 
    {
        Outer_Class3 outer=new Outer_Class3();
        outer.my_function();
    }
}

class Outer_Class3
{
   void my_function()
   {
       int number=1;
       class Inner_Class3
       {
           public void print()
           {
               System.out.println("Inner class - and number= "+number);
           }
       } // end of inner class
       
       // Acessing the innder class
       Inner_Class3 i=new Inner_Class3();
       i.print();
   }
    
}
