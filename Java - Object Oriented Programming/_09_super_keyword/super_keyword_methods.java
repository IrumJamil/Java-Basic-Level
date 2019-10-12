
package _09_super_keyword;
public class super_keyword_methods 
{
    public static void main(String[] args)
    {
        Dog5 d5=new Dog5();
        d5.work();
    }
}

class Animal5
{  
    void eat(){System.out.println("eating...");}  
}
class Dog5 extends Animal5
{  
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");} 
    void work()
    {  
        super.eat();
        bark();  
    }  
}  
