void main()
{
    char c1='R';

    //Checks if the given character is in capital letter or not
    //Returns true if the character is in capital letter else returns false
    System.out.println(Character.isUpperCase(c1));

    //Checks if the given character is in small letter or not
    //Returns true if the character is in small letter else returns false
    System.out.println(Character.isLowerCase(c1));

    c1='4';

    //Checks if the given character is a digit or not
    //Returns true if the character is a digit else returns false
    System.out.println(Character.isDigit(c1));

    c1=' ';

    //Checks if the given character is a whitespace or not
    //Returns true if the character is a whitespace else returns false
    System.out.println(Character.isWhitespace(c1));

    c1='l';

    //Converts the given character to uppercase/capital letter
    System.out.println(Character.toUpperCase(c1));

    c1='H';

    //Converts the given character to lowercase/small letter
    System.out.println(Character.toLowerCase(c1));

    c1='0';

    //Checks if the given character is a letter or digit
    //Returns true if the character is a letter or digit else returns false
    System.out.println(Character.isLetterOrDigit(c1));

    c1='%';

    //Checks if the given character is a letter or not
    //Returns true if the character is a letter else returns false
    System.out.println(Character.isLetter(c1));

    c1='✅';

    //Checks if the given character is an emoji or not
    //Returns true if the character is an emoji else returns false
    System.out.println(Character.isEmoji(c1));

    c1='8';

    //Converting the character to a string and storing it in another variable
    String s=Character.toString(c1);
    System.out.println(s);

    //Converting the character to a integer value
    int d=Character.getNumericValue(c1);
    System.out.println(d);

    //Converting the integer value to a character
    char c2=Character.forDigit(d,10);
    System.out.println(c2);

    //Checking if the given character can be mirrored or not
    c1='<'; //>
    System.out.println(Character.isMirrored(c1));
}
