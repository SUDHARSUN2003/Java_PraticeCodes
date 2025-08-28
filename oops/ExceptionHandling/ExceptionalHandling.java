package ExceptionHandling;

import java.io.IOException;

class customException extends Exception //custom exception
{
    public customException(String message)
    {
        super(message);
    }
}


public class ExceptionalHandling 
{
    static void checkedException() throws IOException
    {
        throw new IOException("This is Checked Exception");
    }


    static void customExceptionExample(int value) throws customException
    {
        if(value < 0)
        {
            throw new customException("Value can't be Nagative");
        }
    }
    public static void main(String[] args) {
        
        try
        {
            System.out.println(15/0); 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }


        try
        {
            int [] a = {1,2,3};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }


        try
        {
            checkedException();
        }
        catch(IOException e)
        {   
            System.out.println(e.getMessage());
        }

        try
        {
            customExceptionExample(-5);
        }
        catch(customException e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Finally executed");
        }
    }
}
