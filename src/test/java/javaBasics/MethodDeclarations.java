package javaBasics;

public class MethodDeclarations {

    public static void main(String[] args) {
        openWhatsapp();

        //sumOfTwoNumbers will return an integer or will give the output as integer
        //By using print statement, we can print the integer
        System.out.println(sumOfTwoNumbers(10,20));

        System.out.println(sumOfTwoNumbers(10,20,30));
        System.out.println(sumOfTwoNumbers(10.5,20.5));
        System.out.println(sumOfTwoNumbers(10,20.5));
    }

    private static void openWhatsapp() {
        System.out.println("This is method1");
    }


    //In General, JAVA does not allow same method names in the same class
    //But under one condition it will allow,

    //Method Overloading: Method name will be same but the arguments should be different
    //Method Overloading promotes code reusability
    //Method Overloading comes under OOPS concept called as polymorphism

    //If we have not given/specified any access modifier, it will be considered as default access modifier
    static int sumOfTwoNumbers(int a, int b)
    {
        int sum=a+b;
        return sum;
    }

    static int sumOfTwoNumbers(int a, int b, int c)
    {
        int sum=a+b+c;
        return sum;
    }

    public static double sumOfTwoNumbers(double a, double b)
    {
        return a+b;
    }

//    public static double sumOfTwoNumbers(int a, double b)
//    {
//        return a+b;
//    }

    //Syntax of declaring a method:
    //accessModifier returnType methodName(parameters)
//    {
        //Method body
//    }

    //Access Modifier: Define the scope or visibility of the method
    //1. Public: Method can be accessed from anywhere
    //2. Private: Method can be accessed only within the class
    //3. Protected: Method can be accessed within the package and outside the package through inheritance
    //4. Default: Method can be accessed only within the package

    //Return Type: Return type of the method
    //Output that we are expecting from the method
    //1. void: Method will not return any value,
    // simply executes the lines of code present inside the method

    //2. int: Method will return an integer value
    //3. char: Method will return a character value
    //4. float: Method will return a floating point value
    //5. double: Method will return a double value
    //6. boolean: Method will return a boolean value
    //7. long: Method will return a long value
    //8. short: Method will return a short value

    //Method Name: We can give any name to the method of your choice

    //Parameters: Optional for a method


}
