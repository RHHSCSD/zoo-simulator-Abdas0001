/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

import java.util.*;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    
    static ArrayList<Animal> animals = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String command;

    public static void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.name + " added to the zoo.");
    }
    
    public static void handleUserCommand() {
        System.out.println("Enter command (feed, sleep, move, stats, exit):");
        command = scanner.nextLine().toLowerCase();

        switch (command) {
            case "feed":
                feedAll();
                break;
            case "sleep":
                makeAllSleep();
                break;
            case "move":
                moveAll();
                break;
            case "stats":
                displayStatistics();
                break;
            case "exit":
                System.out.println("Exiting program.");
                System.exit(0);
            default:
                System.out.println("Invalid command.");
                break;
        }

        for (int i = 0; i > 10; i++) {
            handleUserCommand();
        }
    }

    public static void displayStatistics() {
        System.out.println("Zoo Statistics:");
        // Display statistics for each animal
    }

    public static void feedAll() {
        for (Animal animal : animals) {
            animal.eat();
        }
        System.out.println("All animals fed.");
    }

    public static void makeAllSleep() {
        for (Animal animal : animals) {
            animal.sleep();
        }
        System.out.println("All animals slept.");
    }

    public static void moveAll() {
        for (Animal animal : animals) {
            animal.move();
        }
        System.out.println("All animals moved.");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Add animals to the zoo
        addAnimal(new LandAnimal());
        addAnimal(new BirdAnimal());
        addAnimal(new WaterAnimal());

        // Start handling user commands
        handleUserCommand();
    }
    
}

/*
We can create different diet types (ICarnivore, IOmnivore, IHerbivore).
The Predator class implements ICarnivore and has a method hunt for hunting prey.
The Prey class is a base class for animals that can be hunted.
Carnivore, Omnivore, and Herbivore classes extend Predator or Prey and implement the respective diet interfaces.
In the Zoo class, we can add a method performHunting to simulate predator-prey interactions based on user input.
*/
