/*
- The final keyword in java is used to restrict the user
- final keyword can be used in many context - variable - method - classes
- A final variable that have no value it is called blank final variable or uninitialized final variable
- A final variable that is not initialized at the time of declaration is known as blank final variable
*/
package _08_final_keyword;
public class final_variable 
{
     public static void main(String[] args)
    {
       MotorBike m=new MotorBike();
       m.run();
    }
}

class MotorBike
{
    final int speedlimit=90;
    void run()
    {
         // speedlimit=100;    // it will give a compile time error for resuing a final variable
        
    }
}