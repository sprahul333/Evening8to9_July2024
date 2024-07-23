void main()
{
    int a=3;

    //Post Increment Operations ---> It will increase the value by 1
    //Updated value will not be displayed immediately
    //Updated value will be stored in the temp/buffer memory
    System.out.println(a++);

    //Prints the updated value
    System.out.println(a);

    //Pre Increment Operations ---> Increase the value by 1 immediately
    System.out.println(++a);

    //Post Decrement Operations ---> It will decrease the value by 1
    //Updated value will not be displayed immediately
    //Updated value will be stored in the temp/buffer memory
    System.out.println(a--);

    //Prints the updated value
    System.out.println(a);

    //Pre Decrement Operations ---> Decrease the value by 1 immediately
    System.out.println(--a);

    a=10;

    //10(11) - 10 * 11 / 11(12) - 12(11)
    //10-10*11/11-12
    //10-10*1-12
    //10-10-12
    //-12
//    System.out.println(a++ - --a * ++a / a++ - a--);


    // 9 * 9(10) + 10(9) *(9(8) + 9 * 9)
    //9*9+10*(9+9*9)
    //9*9+10*(9+81)
    //9*9+10*90
    //81+900
    //981
    System.out.println(--a * a++ + a-- *(a-- + ++a * a--));

}