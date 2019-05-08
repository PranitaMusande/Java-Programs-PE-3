//7. Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.

import java.util.Scanner;

public class ExceptionExample
{
    public void checkAge(int age) throws InvalidAgeException
    {
        if (age<18)
        {
            InvalidAgeException ageException=new InvalidAgeException("Invalid Age");
            throw ageException;
        }

        else
            System.out.println("Valid age");
    }

    public static void main(String[] args) {
        ExceptionExample exceptionHandling=new ExceptionExample();
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        age=scanner.nextInt();
        try {
            exceptionHandling.checkAge(age);
        }

        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("In Finally Block");
        }
    }
}
