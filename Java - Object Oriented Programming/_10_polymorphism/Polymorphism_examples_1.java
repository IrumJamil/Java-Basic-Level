package _10_polymorphism;
public class Polymorphism_examples_1 
{
    public static void main(String[] args)
    {
        Shape5 s5=new Rectangle5(); // Java Runtime Polymorphism with Hierarchical Inheritance
        s5.draw();
        s5=new Circle5();
        s5.draw();
        s5=new Triangle5();  
        s5.draw();  
        
        Animal1 a1,a2,a3; // Java Runtime Polymorphism with Multilevel Inheritance
        a1=new Animal1();  
        a2=new Dog1();  
        a3=new BabyDog1();  
        a1.eat();  
        a2.eat();  
        a3.eat();  
        
        Bike5 obj=new Honda5();  
        System.out.println(obj.speedlimit);//90
    }
}

// 1st Example  - Java Runtime Polymorphism with Hierarchical Inheritance
class Shape5{  
    void draw(){System.out.println("drawing...");}  
}  
class Rectangle5 extends Shape5{  
    void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle5 extends Shape5{  
    void draw(){System.out.println("drawing circle...");}  
}  
class Triangle5 extends Shape5{  
    void draw(){System.out.println("drawing triangle...");}  
} 

// 2nd example - Java Runtime Polymorphism with Multilevel Inheritance
class Animal1{  
void eat(){System.out.println("eating");}  
}  
class Dog1 extends Animal1{  
void eat(){System.out.println("eating fruits");}  
}  
class BabyDog1 extends Dog1{  
@Override
void eat(){System.out.println("drinking milk");}
}

// Example 3 - Bike - data member
class Bike5
{  
    int speedlimit=90;
}  
class Honda5 extends Bike5
{  
    int speedlimit=150; 
}
