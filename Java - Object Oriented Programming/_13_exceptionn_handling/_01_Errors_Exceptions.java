/*
Exception Handling:  in Java is one of the powerful process to handle the runtime errors 
so that normal flow of the application can be maintained.
- The core advantage of exception handling is to maintain the normal flow of the application.

Error and Exception both extend Throwable

Errors: An Error indicates serious problem that a reasonable application should not try to catch.
- impossible to recover from error
- errors are of unchecked type (at run time)
- caused by envoirnment (JRE on which code is running)

Exceptions : An exception is an unwanted or unexpected event, which occurs during the execution of a program 
i.e at run time, that disrupts the normal flow of the program’s instructions.
- Possible to recover from Exceptions
- cane be checked or unchecked
- can happend at compile time and run time
- caused by application

Checked: are the exceptions that are checked by compiler at compile time. can't be ignored by compiler
e.g; SQLException, IOException, ClassNotFoundException, FileNotFoundException, InvocationTargetException

Unchecked - are the exceptions that are not checked at compiled time (run time exceptions), ignore at compilation time
e.g; NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, 
     IllegalArgumentException, NumberFormatException

Types of Exceptions in Java
- Built-in Exceptions
- User Defines Exceptions
*/
package _13_exceptionn_handling;
public class _01_Errors_Exceptions 
{
    public static void main(String[] args) 
    {
        
    }
}
