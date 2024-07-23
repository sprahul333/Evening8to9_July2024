void main()
{
    //By default it uses UTF-8 as the charset

    //String Buffer is a mutable sequence of characters
    //String Buffer is a thread-safe, mutable sequence of characters
    //String Buffer is synchronized
    //String Buffer is faster than String Builder

    //String builder is non thread safe, non-synchronized
    //String builder is slower than String buffer

    //Syntax of creating a string buffer object:
    //Here sb1 can be any name of your choice

    StringBuffer sb1=new StringBuffer("This is my first buffer string");

    //How many characters does this string buffer can hold
    //By default the capacity will be 16,
    // if the length of the string is greater than 16 then it will increase the size of the buffer automatically
    System.out.println(sb1.capacity());

    //Prints the number of characters present in the string
    System.out.println(sb1.length());

    System.out.println(sb1);

    //Deleting a character at a particular index position
    sb1.deleteCharAt(3);

    System.out.println(sb1);

    //Replacing the character 'i' that is present at 10th index position
    sb1.setCharAt(10,'i');

    System.out.println(sb1);

    //Inserting a character 'i' at 11th index position
    sb1.insert(11,'i');

    System.out.println(sb1);

    //Sets the length of the string to 10 characters only
    sb1.setLength(10);

    System.out.println(sb1);

    //Adding the data to the original string
    sb1.append("second buffer string");

    System.out.println(sb1);

    //Ensuring that the minimum capacity of the string buffer is 200
    sb1.ensureCapacity(200);

    System.out.println(sb1.capacity());

    //Prints the exact number of characters that the string buffer can hold for us
    System.out.println(sb1.capacity()-sb1.length());

    String s3="Thi is my second buffer string";

    System.out.println(sb1);
    //Content Equals is used when we are trying to compare the data between string and string buffer
    //Case Sensitivity Matters here
    System.out.println(s3.contentEquals(sb1));

    //Reverse a string
    System.out.println(sb1.reverse());

    //Deletes the characters that is present between 5th index till 10th index position
    //Inclusive of starting index position and exclusive of end index position
    sb1.delete(5,10);

    System.out.println(sb1);

    //Converts the stringbuffer to a string value
    String ss3=sb1.toString();
    System.out.println(ss3);
}