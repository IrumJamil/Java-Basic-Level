package _05_encapsulation;
public class Encapsulation1
{
    public static void main(String[] args)
    {
        Teacher t=new Teacher();
        
        t.setTeacher_id(10);
        System.out.println(t.getTeacher_id());
        
        t.setSallery(20000);
        System.out.println(t.getSallery());
        
        t.setName("Ali");
        String n=t.getName();
        System.out.println("My name is "+n);
    }
}
class Teacher
{
    private int teacher_id; // private data members can not be acessed from outside so we need getter and setter function
    private float sallery; 
    private String name;
    
    public int getTeacher_id() // getter setter function help us to use private vaiables.
    {
        return teacher_id;
    }
 
    public void setTeacher_id(int teacher_id) 
    {
        this.teacher_id = teacher_id;
    }

    public float getSallery() 
    {
        return sallery;
    }

    public void setSallery(float sallery) 
    {
        this.sallery = sallery;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}