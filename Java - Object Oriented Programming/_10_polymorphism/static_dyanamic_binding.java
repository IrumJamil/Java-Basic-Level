/*
two types of binding
- Static Binding (also known as Early Binding).
When type of the object is determined at compiled time(by the compiler), it is known as static binding.
- Dynamic Binding (also known as Late Binding).
When type of the object is determined at run-time, it is known as dynamic binding

If there is any private, final or static method in a class, there is static binding.
*/
package _10_polymorphism;
public class static_dyanamic_binding 
{
    public static void main(String[] args) 
    {
        
        Dog d1=new Dog();  // static binding
        d1.eat();
  
        Animal a=new Dog(); //dynamic binding
        a.eat();
        /* object type cannot be determined by the compiler, 
        because the instance of Dog is also an instance of Animal.So compiler doesn't know its type */
        
        
    }
}

// static binding - example
class Dog4{  
 private void eat(){System.out.println("dog is eating...");}  
}

// dynamic binding - example
class Animal3{  
 void eat(){System.out.println("animal is eating...");}  
} 
class Dog3 extends Animal3{  
 void eat(){System.out.println("dog is eating...");}
}
  