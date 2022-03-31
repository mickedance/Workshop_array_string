package org.example;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static void main(String[] args) {


    }

    //     Returns number of elements in the array
    public static int getSize() {
        return names.length;
    }

    /*Sends in an array that set the private static array.
    This should replace all existing names.*/
    public static void setNames(String[] _names) {
        clear();
        for (String name : _names) {

            if (name.split(" ").length == 2) {
                String nameFirst = name.split(" ")[0];
                String nameLast = name.split(" ")[1];
                if (nameFirst.length() > 0 && nameLast.length() > 0) {
                    if (addName(nameFirst, nameLast))
                        System.out.println("Name: " + names[names.length - 1] + " Added");
                    else
                        System.out.println("Error on setting new names");
                }
            } else {
                System.out.println("Wrong namingformat. ");
            }
        }
    }

    private static boolean addName(String name1, String name2) {
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = name1.trim() + " " + name2.trim();

        return names[names.length - 1].equals(name1 + " " + name2);
    }

    //     Should completely empty the array.
    public static void clear() {
        names = new String[0];
        System.out.println("Array name cleared!");
    }

    //    Returns all names in a new array
    public static String[] findAll() {
        return names;

    }
}
