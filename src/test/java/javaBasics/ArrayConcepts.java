package javaBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcepts {

    public static void main(String[] args) {
        //Arrays is a collection of similar data types

        //Syntax of an array:
        //datatype[] arrayName = new datatype[size of the array];

        //arrayName can be anything of your choice but it should be meaningful and follow the rules used to declare the variables

        //Size of the array should be a positive integer
        //0 to n

        //Here we are mentioning the size of the array upfront
        // because we are not sure how many elements we are going to store in the array
        //Based on the size it can decide how much memory should be allocated in the heap

        //Arrays are present in the heap memory

        //Created an array a1 whose size is 5
        int[] a1=new int[5];

        //Prints the size of the array
        System.out.println(a1.length);

        //Prints a garbage value which is understandable by java
        //Displays the data type followed by hash value of the array object
        System.out.println(a1);

        //Display the arrays in a human readble format
        //Arrays.toString() is a predefined method in java

        //Default value of an integer is zero
        System.out.println(Arrays.toString(a1));

        //Fills the complete array with value as 10
        Arrays.fill(a1, 10);

        System.out.println(Arrays.toString(a1));

        //Copying the array a1 into another array a2 whose size is 10
        int a2[]=Arrays.copyOf(a1, 10);

        //Prints the first five values as 10 and remaining five values as zero
        //Since the remaining five values are not initialized, that is why it is taking the default value
        System.out.println(Arrays.toString(a2));

        //Filling the array a2 that is present from 5th index position
        //till the 10th index position
        //Inclusive of start values and exclusive of end values
        Arrays.fill(a2,5,10,20);

        System.out.println(Arrays.toString(a2));

        //Copy the values of array a2 that is present from 5th index position till the 10th index position
        int a3[]=Arrays.copyOfRange(a2, 5, 10);

        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a1));

//        a3[0] ---> Refer to the first index position in the array

        a3[0]=32; //Assigning the value 32 to the first index position in the array

        System.out.println(Arrays.toString(a3));

        a3[2]=45; //Assigning the value 45 to the third index position in the array

        System.out.println(Arrays.toString(a3));

        //Iterate over this array:

        for(int i=0;i<a3.length;i++) {
            System.out.println(a3[i]);
        }

        for(int i=0;i<a3.length;i++) {
            a3[i]=a3.length-i;
        }

        System.out.println(Arrays.toString(a3));

        //Sorts the data in ascending order
        Arrays.sort(a3);

        System.out.println(Arrays.toString(a3));

        //Searching for a particular element in the array
        //If the element is present in the array, it will return the index position of the element
        //If the element is not present in the array, it will return a negative value
        System.out.println(Arrays.binarySearch(a3, 2));

        //Question: Sort the array in descending order
        //Find the duplicate values present in the array
        //Remove the duplicate values present in the array

        //Rotate the array :
        //I/p: [1,2,3,4,5]
        //o/p: [5,1,2,3,4]

        System.out.println("*****************************************************************************************");

        //2D Arrays:
        //2D Arrays can be visualized as a table
        //Rows and Columns

        //2D array is also known as array of arrays:

        //Syntax of a 2D array:
        //datatype[][] arrayName = new datatype[rows][columns];

        //Here we are mentioning the size of the 2D array upfront

        //Creating a 2d array with 3 rows and 3 columns
        double[][] dd1=new double[3][3];

        //Prints the size of the 2D array
        System.out.println(dd1.length);

        //Prints the size of the first row in the 2D array
        System.out.println(dd1[0].length);

        //Prints the size of the second row in the 2D array
        System.out.println(dd1[1].length);

        //Prints the size of the third row in the 2D array
        System.out.println(dd1[2].length);

        //Prints the hash value of the 2D array object
        System.out.println(dd1);

        //Prints the 2D array in a human readable format
        System.out.println(Arrays.deepToString(dd1));

        //Assigning the value 10.5 to the first row and first column in the 2D array
        dd1[0][0]=10.5;

        //Assigning the value 20.5 to the first row and second column in the 2D array
        dd1[0][1]=20.5;

        //Assigning the value 30.5 to the first row and third column in the 2D array
        dd1[0][2]=30.5;

        //Assigning the value 40.5 to the second row and first column in the 2D array
        dd1[1][0]=40.5;

        //Assigning the value 50.5 to the second row and second column in the 2D array
        dd1[1][1]=50.5;

        System.out.println(Arrays.deepToString(dd1));

        //Filling the 1st row with value as 30.2
        Arrays.fill(dd1[0],30.2);

        //Filling the 2nd row with value as 30.324
        Arrays.fill(dd1[1],30.324);

        //Filling the 3rd row with value as 30.3245
        Arrays.fill(dd1[2],30.3245);

        System.out.println(Arrays.deepToString(dd1));

        //Question: Transpose the Matrix:

        //I/p: [1,2,3]
        //     [4,5,6]
        //     [7,8,9]

        //O/p: [1,4,7]
        //     [2,5,8]
        //     [3,6,9]

    }
}
