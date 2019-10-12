package _07_access_modifiers;
public class protected_keyword 
{
    public static void main(String[] args) 
    {
        
    }
}
class Human
{
    protected int age=22; // protected - acessible within package and inherited class
    protected void walk()
    {
        System.out.println("Human can walk");
    }
}
class Farmer extends Human
{
    public void show()
    {
        System.out.println(age);
    }
}
/*
The protected access modifier is accessible within package and outside the package but through inheritance only.
The protected access modifier can be applied on the data member, method and constructor. 
It can't be applied on the class.
*/