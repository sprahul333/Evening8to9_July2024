void main()
{
    //Variable ---> Temporary Storage of Value

    //Scope of the variable is during run-time only
    //Variables will be created during run time and it will destroyed once the execution is completed

    //Rules to be followed while declaring a variable:
    //1. Variable name should start with a small letter
    //2. Variable name should not start with a number or special characters
    //3. Variable name should not have any spaces between them, instead of whitespace, (_) symbol can be used
    //4. JAVA Keywords cannot be used as variable names

    //Different Data Types in JAVA:
    //1. Primitive Data Type: int, char, float, double, boolean, long, short, byte
    //2. Non Primitive Data Type: String, Array, Class, Interface, etc.

    //Syntax of declaring a variable:
    //dataType variableName;

    int a1; //Accepts a value between -2147483648 to 2147483647 (-2^31 to 2^31-1)
    char b2; //Accepts a single value like 'f', 'Y', '1', '2', '%' etc.
    float c3; //Accepts upto 5 significant digits (number of digits after the decimal point)
    double d4; //Accepts upto 16 significant digits
    boolean e5; //Accepts true or false
    long f6; //Accepts a value between -2^63 to 2^63-1
    short g7; //Accepts a value between -32768 to 32767
    byte h8; //Accepts a value between -128 to 127

    //Declare a value to the variables:
    a1=200;
    b2=' ';
    c3=4.53f; //Whenever we are assigning any value to the float we need to mention the letter f at the last
    d4=32.252355;
    e5=true;
    f6=932532532;
    g7=-20004;
    h8=-110;

    System.out.println(a1);
    System.out.println(b2);
    System.out.println(c3);
    System.out.println(d4);
    System.out.println(e5);
    System.out.println(f6);
    System.out.println(g7);
    System.out.println(h8);

    a1=240;
    b2=' ';
    c3=4.53f; //Whenever we are assigning any value to the float we need to mention the letter f at the last
    d4=32.252355;
    e5=true;
    f6=932532532;
    g7=-20004;
    h8=-110;

    //Whenever we are performing any arithmetic operations with a character, we will be taking the ascii value of that
    //200-32*(-20004)-(-110)
    //200+640128+110
    //640438
    System.out.println("The Value is: "+(a1-b2*g7-h8)+" -- Output achieved");
    System.out.println(STR."The Value is: \{(a1-b2*g7-h8)} -- Output achieved");

    //With boolean values we cannot perform any arithmetic operations
//    System.out.println(STR."\{e5-g7}");

    //Java is a statically typed language ---> we need to know the data type of the variable that we are declaring upfront

    //var is the concept used to declare the variables, if we are not so sure about which data type we need to assign
    //Since JDK 10 we have this feature
    var o1="Hello";

    System.out.println(o1.getClass());

    //By using the var concept we will be losing the privilege of reassigning the variables
    var o2=300;

    System.out.println(o2);

    //Unnamed Variables:

    //Only used for declartion sake
    //We should be sure that we are not using that value anywhere in that program
    int _ =100;

}