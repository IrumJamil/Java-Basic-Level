/*

*/
package _08_final_keyword;
public class final_method 
{
     public static void main(String[] args)
    {
      Honda h=new Honda();
      h.run();
    }
}

class MotorBike1
{
    final void run() // If you make any method as final, you cannot override it
    {
         System.out.println("motorbike is running");
    }
}
class Honda extends MotorBike1
{
    /* void run()
    {
        System.out.println("Please run safely with 100kmph"); // it will a compile time error to override a final method
    }
    */
}