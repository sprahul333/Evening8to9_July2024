void main()
{
    //Switch Case:

    //We will be using in the scenario where we have to deal with more than 4 else if

    //Syntax of switch case:
    //switch(case):
//    case 1: //block of code break;
//    case 2: //block of code break;
//    case 3: //block of code break;
//    default: //block of code break;


    int a = 20;

    switch (a)
    {
        case 1:
            System.out.println("Value of a is 1");
            break;

        case 10:
            System.out.println("Value of a is 10");
            break;

        case 20:
            System.out.println("Value of a is 20");
            break;

        case 30:
            System.out.println("Value of a is 30");
            break;

        case 40:
            System.out.println("Value of a is 40");
            break;

        case 50:
            System.out.println("Value of a is 50");
            break;

        default:
            System.out.println("No particular case found for the value: "+a);
            break;
    }

    System.out.println(performArithmeticOperations(10,20,'+'));


}

//from JAVA 14 onwards it supports the use of switch in return types
double performArithmeticOperations(int a, int b, char op) {
    return switch (op) {
        case '+' -> {
            yield a + b; //Yield is used to return the value to the switch case
        }

        case '-' -> {
            yield a - b;
        }

        case '*' -> {
            yield a * b;
        }

        case '/' -> {
            yield a / b;
        }

        case '^' -> {
            yield Math.pow(a, b);
        }

        default -> {
            yield -1;
        }
    };
}
