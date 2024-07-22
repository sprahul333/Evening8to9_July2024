void main()
{
    //Conditional Statements:

    //We perform the validation of different conditions using if else statement:

    int a=30;

    // == that means value present on the left hand side is same as value present on the right hand side
    // != that means value present on the left hand side is not same as value present on the right hand side

    if(a==10)
        System.out.println(STR."Value of a is \{a}");
    else
        System.out.println(STR."Value of a is not as expected and the current value is \{a}");

    a=35;

    if(a!=35)
        System.out.println(STR."Value of a is not 35");
    else
        System.out.println("Both the values are matching");

    int b=200;

    //We can have multiple else if conditions between a if and a else

    if(b/4==100)
        System.out.println("Quotient is 100");
    else if(b/3==100) //Checking the code with another condition
        System.out.println("Quotient is 100 when divided by 3");
    else if(b/2==100)
        System.out.println("Quotient is 100 when divided by 2");
    else
        System.out.println("Condition is not present");
}