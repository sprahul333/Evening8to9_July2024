package javaBasics;

//In the same file we can have multiple classes but only one class can be public

//If we do not assign any default value to a string, it will take null as the default value
//If we do not assign any default value to an integer, it will take 0 as the default value
//If we do not assign any default value to a double, it will take 0.0 as the default value
//If we do not assign any default value to a float, it will take 0.0 as the default value
//If we do not assign any default value to a boolean, it will take false as the default value
//If we do not assign any default value to a boolean, it will take ' ' as the default value

//While we create an object, a constructor will be called
//Constructor is a special type of method which will not have any return type
//Constructor will be called by default when we create an object
//Constructor will have the same name as the class name

//If we have a constructor and a method, first constructor will be executed followed by the methods that you have called

//If we do not have a constructor, then the default constructor will be called

class Names
{
    String firstName;
    String middleName;
    String lastName;

    //Syntax of a default constructor:
    //accessModifier ClassName()
    //{
    //    //Constructor body
    //}

    //Private constructors are not at all suggestable, it is a bad practice
    //Private constructor ---> You are blocking the creation of objects for that particular class
//    private Names()
//    {
//        System.out.println("Default Constructor Called");
//
//        firstName="Sai";
//        middleName="Krishna";
//        lastName="K";
//    }

    public Names()
    {
        System.out.println("Default Constructor Called");

        firstName="Sai";
        middleName="Krishna";
        lastName="K";
    }

    //Parameterized Constructor:
    //Constructor with parameters

    //Syntax of a parameterized constructor:
    //accessModifier ClassName(parameters)
    //{
    //    //Constructor body
    //}

    public Names(String fName, String mName, String lName)
    {
        System.out.println("Parameterized Constructor Called");

        firstName=fName;
        middleName=mName;
        lastName=lName;
    }

    //If the keyword static is not there, then it is a non static method
    public void displayName()
    {
//        System.out.println("First Name is: "+firstName);
        System.out.println(STR."First Name is: \{firstName}");
        System.out.println(STR."Last Name is: \{lastName}");
        System.out.println(STR."Middle Name is: \{middleName}");
    }

    public static void displayNames()
    {
        System.out.println("Static Method");
    }
}

class PhoneNumbers {

}

class LoginDetails{

}

public class ConstructorConcepts {

    public static void main(String[] args) {

        //We have to call a non static method from other class

        //Create a reference of the class means
        //Creating an object of the class

        //Syntax of creating an object:
        //ClassName objName=new ClassName();

        //Here objName can be anything of your choice
        //While declaring the objname, we should follow the rules used to declare the variables

        //Objects that are created are present in the heap memory

        //Creating a reference/object of Names class
        Names n1=new Names();

        //Calling the displayName() method from the Names class using the reference value
        n1.displayName();

        //Calling a static method from Another Class:
        //ClassName.methodName()

        //Static methods are always binded to the class
        //Non Static Methods are always binded to the heap memory
        Names.displayNames();

        Names n2=new Names("Sai","Gnanadeep","Kumar");
    }
}
