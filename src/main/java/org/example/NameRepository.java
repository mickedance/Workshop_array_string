package org.example;

import java.util.Arrays;

public class NameRepository {
    private static String[] string;

    public static void main(String[] args) {


    }

    //     Returns number of elements in the array
    public static int getSize() {
        return string.length;
    }

    /*Sends in an array that set the private static array.
    This should replace all existing names.*/
    public static void setNames(String[] names) {

    }

    //     Should completely empty the array.
    public static void clear() {
        string = new String[0];
    }

    //    Returns all names in a new array
    public static String[] findAll() {

        return string;

    }
}
