package javaBasics;

//Pallindrome Program:
//Word and the word reversed is same or not
//Ex: dad , read the string in a reverse order it will still be dad

//Anagram Program:
//We have two words , when we sort the order of the characters in ascending order
//Both the words should be same
//Word 1: listen , Word 2: silent

//Difference Between two strings:
//Prints the different set of characters that is present between two strings

//Ex: String s="Ku3a104;
//O/p: 8
//Calculate the sum of numbers in a strings

public class LoopingConcepts {

    public static void main(String[] args) {

        //Loop ---> Repeating the same thing again and again till the condition is satisfied

        //Different kinds of loops in java:
        //1. For Loop
        //2. While Loop
        //3. Do While Loop

        //While Loop:
        //Loop keeps on running until the condition is satisfied

        //Syntax of while loop:
        //while(condition to be satisfied)
//        {
//          Block of code to be written
//        }

        int a=20;

        while(a<30)
        {
            System.out.println("Value of a is "+a);
            a=a+1;
        }

        System.out.println("***************************************************");
        a=40;

        while(a>=40)
        {
            System.out.println("Value of a is "+a);
            a=a-1;
        }

        System.out.println("***************************************************");

        a=50-20*30+40/2+(4-20*49/7);

        System.out.println(a);
        // % ---> Modulus operation ---> Remainder of a number
        while(a%4==0)
        {
            System.out.println(a+" is divisible by 4");
        }

        System.out.println("***************************************************");

        //Do While Loop:
        //Loop runs atleast once irrespective of whether the condition is satisfied or not

        //Syntax of do-while loop:
        //do
//        {
//          Block of code to be executed
//        }
//        while(condition to be satisfied);
        int b=30;

        do {
            System.out.println(b);
        }
        while(b!=30);

        System.out.println("**********************************************************************************************");

        b=40;

        do {
            System.out.println(STR."\{b} is divisible by 3");
            b=b-4;
        }
        while(b%3==0);

        /*******************************************************************************************************************************************/

        //For Loop:
        //Loop keeps on running until the condition is satisfied

        //Syntax of for loop:
        //for(initial value; condition to be satisfied; iteration counter)
//        {
//           Block of code to be executed
//        }

        System.out.println("*************************************************************************************************");

        //For loop does not require a seperate line of code for variable initialization
        //We can declare any sort of fresh variables within the for loop.

        for(int i=1;i<10;i=i+2)
        {
            System.out.println(i);
        }

        System.out.println("****************************************************************************************");

        for(int i=10;i>5;i=i-1)
        {
            if(i%2==0)
                System.out.println(i);
        }

        System.out.println("*****************************************************************************************");

        //Below set of code will run into infinite loop because there is no iteration counter
        for(int i=10;i>5;)
        {
            if(i%2==0)
            {
                System.out.println(i);
                break; //To Terminate the loop immediately
            }
        }

        System.out.println("*****************************************************************************************");


        System.out.println("*******************************************************************************************");

        for(int i=3;;) //Infinite times
        {
            if(i%2==0)
            {
                System.out.println(i);
                break; //To Terminate the loop immediately
            }

            else
                break;
        }

        System.out.println("****************************************************************************************************************************");

        for(int i=4;i<40;i=i+4)
        {
            if(i==20)
                continue; //Skip that particular iteration of the loop

            System.out.println(i);
        }


        //Reversing a string
        String s3="This is a proper for loop";

        for(int i=s3.length()-1;i>=0;i=i-1)
        {
            System.out.print(s3.charAt(i));
        }

        System.out.println("**********************************************************************************");

        //Fibonacci Series
        int c1=0;
        int d1=1;

        System.out.print(c1+" "+d1+" ");

        int n=10;

        for(int i=0;i<n;i=i+1)
        {
            int e1=(c1+d1);
            System.out.print(e1+" ");
            c1=d1;
            d1=e1;
        }

        System.out.println("*******************************************************************************************************");

        //Reversing the number

        int m=2004;
        int rev=0;

        while(m>0)
        {
            int rem=m%10;
            rev=(rev*10)+rem;
            m=m/10;
        }

        System.out.println(rev);


    }
}
