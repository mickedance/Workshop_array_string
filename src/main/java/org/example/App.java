package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Se size of empty Array
        System.out.println(NameRepository.getSize());

        // Add names to array
        String[] names = {"Mikael Svensson", "klara Sagasson"};
        NameRepository.setNames(names);

        // See current size
        System.out.println(NameRepository.getSize());

        //Print out all names in array
        System.out.println(Arrays.toString(NameRepository.findAll()));


    }
}
