package _13_exceptionn_handling;

public class _05_throw_throws {

    public static void main(String[] args) {
        // using throw - used with in a method
        avg();

        // using throws - used with method signature
        try {
            my_function();
        } finally {
            System.out.println("caught");
        }
        
        // both use at a same time
        checkAge(15);
    }

    static void avg() {
        try {
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
    }

    static void my_function() throws ArithmeticException {
        System.out.println("Inside function");
        throw new ArithmeticException("Demo");
    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}

/*
throw :  in Java is used to explicitly throw an exception from a method or any block of code.

throws :  is a keyword in Java which is used in the signature of method to indicate 
          that this method might throw one of the listed type exceptions. 
*/