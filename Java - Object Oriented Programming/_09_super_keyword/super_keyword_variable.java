/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object.
- super can be used to refer immediate parent class instance variable.
- super can be used to invoke immediate parent class method.
- super() can be used to invoke immediate parent class constructor.
*/
package _09_super_keyword;
public class super_keyword_variable 
{
    public static void main(String[] args)
    {
      Dog4 d4=new Dog4();
      d4.printColor();
    }
}
class Animal4
{  
    String color="white";  
}
class Dog4 extends Animal4
{  
    String color="black";
    void printColor()
    {  
        System.out.println(color);//prints color of Dog4 class - black
        System.out.println(this.color);
        System.out.println(super.color);//prints color of Animal4 class - white
    }  
}  
