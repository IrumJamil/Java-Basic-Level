/*
If a class have an entity reference, it is known as Aggregation. 
- Aggregation represents HAS-A relationship.
- Code reuse is also best achieved by aggregation when there is no is-a relationship.

Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; 
otherwise, aggregation is the best choice.
*/
package _06_inheritance;
public class Aggregation 
{
    public static void main(String[] args) 
    {
        Address address1=new Address("Okara","Punjab","Pakistan");
        Emp e=new Emp(01,"Ali",address1);
        // Employee has an entity reference address, so relationship is Employee HAS-A address.
    }
}
class Address 
{
    String city,state,country;   
    Address(String city, String state, String country) 
    {  
        this.city = city;  
        this.state = state;  
        this.country = country;
    }  
}  
class Emp
{
    int id;  
    String name;  
    Address address; 
    Emp(int id, String name,Address address) 
    {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
    void display()
    {
        System.out.println(id+" "+name);  
        System.out.println(address.city+" "+address.state+" "+address.country);  
    }  
}