// The super keyword can also be used to invoke the parent class constructor
package _09_super_keyword;
public class super_keyword_constructor 
{
    public static void main(String[] args)
    {
        Dog6 d6=new Dog6();
    }
}

class Animal6
{  
      Animal6()
      {
          System.out.println("animal is created");
      }
      void run()
      {
          
      }
}
class Dog6 extends Animal6
{  
    Dog6(){  
        super();
        System.out.println("dog is created"); 
    }  
}