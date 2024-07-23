void main()
{
    //Wrapper Classes ---> Convert this string to an integer, double, float, boolean or any primitive data type

    String s1="2042";

    //Convert the string to an integer:
    int i1=Integer.parseInt(s1);

    s1="234.2532";

    //Converting the String to a double value:
    double d2=Double.parseDouble(s1);

    s1="false";

    //Convert string to boolean
    boolean b3=Boolean.parseBoolean(s1);

    s1="24.532f";

    //Converting string to float
    float f4=Float.parseFloat(s1);
}