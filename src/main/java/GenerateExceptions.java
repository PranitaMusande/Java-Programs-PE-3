//8. Write a program that will generate exceptions of type NegativeArraySizeException,
//        IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//        displaying the message stored in the exception object.

import java.util.Scanner;

public class GenerateExceptions
{
    public void checkNegativeArraySizeException() throws NegativeArraySizeException
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        num=sc.nextInt();
        try{
            int array[]=new int[num];

            if(num<0)
            {
                NegativeArraySizeException negativeArraySizeException=new NegativeArraySizeException();
                throw negativeArraySizeException;
            }
        }
        catch (NegativeArraySizeException e){
            System.out.println("Array size cant be negative");
        }
    }

    public void checkIndexOutOfBoundsException() throws IndexOutOfBoundsException
    {
        String str = "hello";
        try
        {
            System.out.println(str.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Wrong character index number, please enter correct number. " + e);
        }
    }

    public void checkNullPointerException(String s)
    {
        int arr2[]=null;

        try{
            if(arr2[0]==30){

            }
        }
        catch (NullPointerException e){

        }


    }


    public static void main(String[] args)
    {
        GenerateExceptions generateExceptions=new GenerateExceptions();
        generateExceptions.checkNegativeArraySizeException();

        generateExceptions.checkIndexOutOfBoundsException();

        generateExceptions.checkNullPointerException(null);
    }
}
