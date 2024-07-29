package javaBasics;

public class ExceptionHandling {

    //throws keyword is used to declare an exception
    //throws keyword is used to delegate the responsibility of exception handling to the caller
    public static void main(String[] args) throws Exception {

        //Exception Handling is always during the run time

        //Exception is an event that disrupts the normal flow of the program
        //Exception Handling is a mechanism to handle runtime errors

        //There are two types of errors:
        //1. Compile Time Error - Syntax Error, Missing semicolon, etc.
        //2. Run Time Error - Exception Handling

        //There are two types of exceptions:
        //1. Checked Exception - Compile time exceptions
        //2. Unchecked Exception - Run time exceptions

        //Exception Handling is done using try-catch block
        try
        {
            //Code that is prone to errors, we write it in the try block
            //Block of code
        }

        catch(Exception e)
        {
            //Block of code
        }

        //Finally block will be executed irrespective of the execution
        finally
        {
            //Block of code
        }

        try {

            String c=null;
            System.out.println(c.length());

            //Number Format Exception
            Integer.parseInt("49.23");
            //Arithmetic Exception
            int a = 10 / 0;
        }

        //e is a variable of that particular exception
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        catch (NumberFormatException e2)
        {
            System.out.println("Number Format Exception Occured");
        }

        catch (NullPointerException e4)
        {
            //Throwing my own error message
            //throw new Exception -- is used to throw an exception

            throw new Exception("Null Pointer Exception Occured, please check");
        }


        //Exception if the parent class of all different kinds of exceptions
        catch (Exception ex)
        {
            //Prints the exception message or the exact reason of failure
            //Prints the exact reason of the failure
            ex.printStackTrace();

            //Prints the exception message
//            System.out.println(ex.getMessage());
        }


        finally {
            System.out.println("Finally block is executed");
        }
    }


}
