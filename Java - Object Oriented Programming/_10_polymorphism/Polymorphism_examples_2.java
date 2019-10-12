package _10_polymorphism;
public class Polymorphism_examples_2 
{
    public static void main(String[] args) 
    {
        Animal a;  
        a=new Dog();  
        a.eat();  
        a=new Cat();  
        a.eat();  
        a=new Lion();  
        a.eat();  
        
        Bank b;  
        b=new BOP();  
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
        b=new UBL();  
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
        b=new Alpha();  
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
        
        
    }
}

// Example - Animal

class Animal{  
    void eat(){ System.out.println("eating...");}  
}  
class Dog extends Animal{  
    void eat(){System.out.println("eating bread...");}  
}  
class Cat extends Animal{  
    void eat(){System.out.println("eating rat...");}  
}  
class Lion extends Animal{  
    void eat(){System.out.println("eating meat...");}  
}  

// Example Bank
class Bank{  
float getRateOfInterest(){return 0;}  
}  
class BOP extends Bank{  
float getRateOfInterest(){return 8.4f;}  
}  
class UBL extends Bank{  
float getRateOfInterest(){return 7.3f;}  
}  
class Alpha extends Bank{  
float getRateOfInterest(){return 9.7f;}  
}  

