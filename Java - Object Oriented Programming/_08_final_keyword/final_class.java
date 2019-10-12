package _08_final_keyword;
public class final_class 
{
     public static void main(String[] args)
    {
      
    }
}

final class MotorBike2 // If you make any class as final, you cannot extend it
{
    
}
/*
class Honda2 extends MotorBike2 // it will give a compile time error to extends a final class
{
    void run()
    {
        System.out.println("Please run safely with 100kmph");
    }
}
*/

/*
A class declared as final cannot be extended 
while a method declared as final cannot be overridden in its subclasses.
*/
