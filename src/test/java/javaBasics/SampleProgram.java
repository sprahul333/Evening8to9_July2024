package javaBasics;

//Class is nothing but a blueprint of an object, method, variables, etc.
//Class is nothing but an entity that binds the data and methods together.
//Class is a template or blueprint from which objects are created.
public class SampleProgram {

    //Whatever the logic we write it should be present inside a main method.

    //Main method is something that the java compiler will recognise and execute the program present inside the main method
    public static void main(String[] args)
    {
        //System.out.println is a predefined method in java
        //which is used to print the output on the console and moves the cursor to the next line
        System.out.println("Hello World");

        //Shortcut for printing system.out.println ---> Type sout followed by enter key
        System.out.println("This is my first program");

        //System.out.println helps us in performing arithmetic operations
        //Follows BODMAS Rule during arithmetic operations ---> Bracket of Division Multiplication Addition Subraction
        System.out.println(20-40*40+20);

        //Prints the data onto the console
        System.out.print("40-20*200 =");

        System.out.println(40-20*200);
    }
}
