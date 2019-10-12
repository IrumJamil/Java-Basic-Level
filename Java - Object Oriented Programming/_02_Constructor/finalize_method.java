/*
Finalize() is the method of Object class. 
This method is called just before an object is garbage collected. 
finalize() method overrides to 
 - dispose system resources
 - perform clean-up activities
 - minimize memory leaks.
*/
package _02_Constructor;
public class finalize_method 
{
    public static void main(String[] args) 
    {
        Test t=new Test();
           
        t = null;
        System.gc(); // calling garbage collector      
    }
}

class Test
{
    Test()
    {
        System.out.println("I am constructor");
    }
    @Override
    protected void finalize()
    {   
        System.out.println("this function is called at the end");   
    }   
}
