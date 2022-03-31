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
        String[] names = {"Mikael Svensson", "klara Sagasson", "Johan Svensson", "Nina Sagasson"};
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
        //Find by first name
        //first a name that exists
        names = new String[0];
        names = NameRepository.findByFirstName("klara");
        if(names.length>0)
            System.out.println(Arrays.toString(names));
        else
            System.out.println("Could not found this names");

        //Found a name that does not exists
        names = new String[0];
        names = NameRepository.findByFirstName("lara");
        if(names.length>0)
            System.out.println(Arrays.toString(names));
        else
            System.out.println("Could not found this names");



        // Find by last name
        names = new String[0];
        names = NameRepository.findByLastName("sagasson");
        if(names.length>0)
            System.out.println("Find by firstname: " +Arrays.toString(names));
        else
            System.out.println("Could not found this names");

        //Found a name that does not exists
        names = new String[0];
        names = NameRepository.findByLastName("Svensson");
        if(names.length>0)
            System.out.println("Find by last name: " +Arrays.toString(names));
        else
            System.out.println("Could not found this names");

        names= new String[0];

        if(NameRepository.update("Mikael Svensson", "Klara Sagasson"))
            System.out.println("updated");
        else
            System.out.println("could not update name");
    }
}
