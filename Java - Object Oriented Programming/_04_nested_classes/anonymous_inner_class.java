/*
A class that have no name is known as anonymous inner class in java
Anonymous inner class can be created by two ways
- Class (may be abstract or concrete).
- Interface
*/
package _04_nested_classes;
public class anonymous_inner_class 
{
    public static void main(String[] args) 
    {
        Anonymous_Inner_Class4 inner=new Anonymous_Inner_Class4() 
        {
            @Override
            public void my_method() 
            {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        inner.my_method();
    }
}

abstract class Anonymous_Inner_Class4
{
    public abstract void my_method();
}