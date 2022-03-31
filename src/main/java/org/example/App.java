package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Se size of empty Array
        System.out.println("Size now: "+NameRepository.getSize());

        // Add names to array
        String[] names = {"Mikael Svensson", "klara Sagasson"};
        NameRepository.setNames(names);

        // See current size
        System.out.println("Size now: " +NameRepository.getSize());

        //Print out all names in array
        System.out.println(Arrays.toString(NameRepository.findAll()));

        //Search for name
        System.out.println("Founded: "+ NameRepository.find("Mikael svensson"));

        //Add name to array

        String name = "Joakim Andersson";
        if(NameRepository.add(name)){
            System.out.println("Added: " + NameRepository.find(name));
        }

    }
}
