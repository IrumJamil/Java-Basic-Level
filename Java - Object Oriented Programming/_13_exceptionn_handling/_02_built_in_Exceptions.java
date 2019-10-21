/*

*/
package _13_exceptionn_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class _02_built_in_Exceptions
{
    public static void main(String[] args)
    {
        // ArithmeticException
        try
        {
            int data=100/0; //code that may raise exception
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally // A finally block contains all the crucial statements that must be executed whether exception occurs or not. 
        {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
        System.out.println("Rest of code is working");
        
        // NullPointerException
        try
        {
            String s=null; //code that may raise exception
            System.out.println(s.length());//NullPointerException
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of code is runing");
        
        // ArrayIndexOutOfBoundsException
        try
        {
            int a[]=new int[5];
            a[10]=50; //ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        // StringIndexOutOfBound Exception
        try
        {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
        
        // FileNotFound Exception
        try
        {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        
        // NumberFormat Exception
        try
        {
            int num = Integer.parseInt ("Ali") ; // ali is not a number
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception");
        }
        
        System.out.println("Rest of code is runing");
    }
}

