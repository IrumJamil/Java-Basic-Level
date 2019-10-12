package _09_super_keyword;
public class super_keyword_example 
{
    public static void main(String[] args)
    {
        Employee e1=new Employee(1,"Ali",45000f);
        e1.display(); 
    }
}

class Person{  
    int id;  
    String name;  
    Person(int id,String name)
    {  
        this.id=id;  
        this.name=name;  
    }  
}
class Employee extends Person{  
    float salary;  
    Employee(int id,String name,float salary)
    {  
        super(id,name);//reusing parent constructor  
        this.salary=salary;  
    }  
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }  
}  
