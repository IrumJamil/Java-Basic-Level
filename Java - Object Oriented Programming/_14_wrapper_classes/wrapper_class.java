package _14_wrapper_classes;
public class wrapper_class 
{
    public static void main(String[] args) 
    {
        int a=20;  
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
        System.out.println(a+" "+i+" "+j);  // 20 20 20
        
        Integer b=new Integer(3);    
        int c=b.intValue();//converting Integer to int explicitly  
        int d=b;//unboxing, now compiler will write a.intValue() internally    
        System.out.println(a+" "+i+" "+j);  
        
        Integer i1 = new Integer(10); //creating an Integer Object
        int i2 = i; // unboxing the Object 
        System.out.println("Value of i: " + i1); 
        System.out.println("Value of i1: " + i2); 
        
       
        Character gfg = 'a';  //Autoboxing of char 
        char ch = gfg; // Auto-unboxing of Character 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of gfg: " + gfg); 
        
       
        int var1=Integer.parseInt("123");
        
        Integer var2=Integer.valueOf("123");
        int var3=var2.intValue();
        
        
        
        
        
    }
}

/*
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
Note:
Objects are needed if we wish to modify the arguments passed into a method 
(because primitive types are passed by value).
autoboxing - convert primitives into objects
unboxing - objects into primitives automatically.
*/