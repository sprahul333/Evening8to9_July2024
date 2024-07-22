void main()
{
    //String is a combination of characters
    //Strings are immutable ---> No one change the values of the string
    //String pool is nothing but a memory allocated in the heap for storing the strings
    //String pool is a separate memory location in the heap
    String s="This is my first string";

    //Prints the string onto the console
    System.out.println(s);

    //Prints the length of the string
    //Number of characters present in the string
    System.out.println(s.length());

    //Checks if the given string is empty or not
    //Returns true if the string is empty else returns false
    System.out.println(s.isEmpty());
    System.out.println(s.isBlank());

    //Prints the string to capital letters
    System.out.println(s.toUpperCase());

    //Prints the string to small letters
    System.out.println(s.toLowerCase());

    s="This is my first string";

    //Checks if the given string is starting with 'his' or not
    //Returns true if the above condition is satisfied else it returns false
    System.out.println(s.startsWith("his"));
    System.out.println(s.startsWith("This"));
    System.out.println(s.startsWith("this is"));


    s="This is my first string";

    //Checks if the given string is ending with 'ing' or not
    //Returns true if the above condition is satisfied else it returns false
    System.out.println(s.endsWith("ing"));
    System.out.println(s.toUpperCase().endsWith("ING"));
    System.out.println(s.endsWith("g"));

    s="This is my first string";

    //Repeats the same string for four times
    System.out.println(s.repeat(4));

    //Replacing the word 'first' with 'Second' in the string
    System.out.println(s.replace("first","Second"));

    //If the word to be replaced is not found, then it will not replace anything
    System.out.println(s.replace("First","Third"));

    s="This is my first string, and doing my coding for the first time";

    //Replaces the first occurrence of the word 'first' with 'Second'
    System.out.println(s.replace("first","Second"));

    //Replace the first occurrence of the word 'first' with 'Second'
    System.out.println(s.replaceFirst("first","Second"));

    //Finds the character that is present at 10th index position
    //We need to start reading the characters from the 0th index position
    System.out.println(s.charAt(10));

    s="This is my first string, and doing my coding for the first time";

    System.out.println(s.charAt(40));

    //Below line of code throws StringIndexOutofBounds Exception:
    //We are trying to access a character that is greater than the length of the string
//    System.out.println(s.charAt(200));
//     System.out.println(s.charAt(-200));
    System.out.println(s.charAt(2));

    s="This is my first string, and doing my coding for the first time";

    //Prints the string starting from 10th index position till the end
    System.out.println(s.substring(10));
    System.out.println(s.substring(40));

    //Prints the string starting from 30th index position till the 35th index position
    //Inclusive of starting index position and exclusive of ending index position
    System.out.println(s.substring(30,35));

    //Below line of code throws StringIndexOutOfBounds Exception because,
    //the starting index position is greater than the ending index position
//    System.out.println(s.substring(100,2));


    s="This is my first string, and doing my coding for the first time";

    //Returns the index position of the first occurence of the character 'i'
    System.out.println(s.indexOf('i'));

    //Returns -1 if the character is not found in the string
    System.out.println(s.indexOf('z'));

    //Returns the index position of the first occurence of the word 'first'
    System.out.println(s.indexOf("first"));

    s="This is my first string, and doing my coding for the first time";

    //Returns the index position of the first occurence of the word 'first' after the 40th index position
    System.out.println(s.indexOf("first",40));

    //Prints the index position of the last occurence of the word 'first'
    System.out.println(s.lastIndexOf("first"));
    System.out.println(s.lastIndexOf('o'));


    String s2="            This is my current string                ";

    //Removes the white spaces that is present at the start and at the end of the string
    System.out.println(s2.trim());
    System.out.println(s2.strip());

    //Removing the white spaces that is present at the end of the string
    System.out.println(s2.stripTrailing());

    //Removes the white spaces that is present at the start of the string
    System.out.println(s2.stripLeading());

    //Checks if the word 'current' is present in the string or not
    //Returns true if the above condition is satisfied else it returns false
    System.out.println(s2.trim().contains("current"));
    System.out.println(s2.trim().contains("currenT"));
}