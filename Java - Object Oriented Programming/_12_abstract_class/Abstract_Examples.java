package _12_abstract_class;
public class Abstract_Examples 
{
    public static void main(String[] args) 
    {
        Shape s=new Circle1();
        s.draw();  

        Bike b = new Honda();
        b.run();
        b.changeGear(); 
        
        Bank b1;  
        b1=new UBL();
        System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");
        b1=new BOP();
        System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %"); 

    }
}

// 1st exmaple 
abstract class Shape
{  
    abstract void draw();  
}  
class Rectangle extends Shape
{  
    void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  
class Circle1 extends Shape
{  
    void draw()
    {
        System.out.println("drawing circle");
    }  
}  


// 2nd example - Abstract class having constructor, data member and methods
abstract class Bike
{  
   Bike()
   {
       System.out.println("bike is created");
   }  
   abstract void run();  
   void changeGear()
   {
       System.out.println("gear changed");
   }  
 }
 class Honda extends Bike
 {  
 void run(){System.out.println("running safely..");}  
 }  

// 3rd exmaple - of Bank
abstract class Bank
{    
    abstract int getRateOfInterest();    
}    
class UBL extends Bank
{    
    int getRateOfInterest()
    {
        return 7;
    }    
}    
class BOP extends Bank
{    
    int getRateOfInterest()
    {
        return 8;
    }    
}    

