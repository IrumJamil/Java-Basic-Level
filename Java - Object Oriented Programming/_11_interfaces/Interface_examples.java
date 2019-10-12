package _11_interfaces;
public class Interface_examples 
{
    public static void main(String[] args) 
    {
        Drawable d=new Circle();
        d.draw();
        
        Bank2 b2=new UBL1();
        System.out.println("ROI: "+b2.rateOfInterest());  
        
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show(); 
    }
}

// 1st example
interface Drawable
{  
    void draw();  
}   
class Rectangle1 implements Drawable
{  
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  
class Circle implements Drawable
{  
    public void draw()
    {
        System.out.println("drawing circle");
    }  
}  

// 2nd exmaple 
interface Bank2
{  
    float rateOfInterest();  
}  
class UBL1 implements Bank2
{  
    public float rateOfInterest()
    {
        return 9.15f;
    }  
}  
class BOP1 implements Bank2
{  
    public float rateOfInterest()
    {
        return 9.7f;
    }  
}  

// 3rd Example
interface Printable
{  
    void print();  
}  
interface Showable extends Printable
{  
    void show();  
}  
class TestInterface4 implements Showable
{  
    public void print()
    {
        System.out.println("Hello");
    }  
    public void show()
    {
        System.out.println("Welcome");
    }
}