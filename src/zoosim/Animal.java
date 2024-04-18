/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Home
 */
public class Animal {
     
    private String id = "";
    public String name = "";
    private String species = "";
    private char sex;
    private int age;
    private int[] position = new int[2];
    private int size;
    private int speed;
    private double direction;
    static int hunger;
    static int fatigue;
    private Image image = new Image();
    static String sound = "";
    
    public void turn(int degrees) {
        direction += degrees;
        System.out.println(name + " turned " + degrees + " degrees.");
    }

    public void place(int x, int y) {
        position[0] = x;
        position[1] = y;
        System.out.println(name + " placed at (" + position[0] + ", " + position[1] + ").");
    }

    public void move() {
        position[0] += speed * Math.cos(Math.toRadians(direction));
        position[1] += speed * Math.sin(Math.toRadians(direction));
        System.out.println(name + " moved to (" + position[0] + ", " + position[1] + ").");
    }

    public void makeSound() {
        System.out.println(name + " made a sound.");
    }

    public void eat() {
        hunger -= 10;
        System.out.println(name + " ate.");
    }

    public void sleep() {
        fatigue -= 5;
        System.out.println(name + " slept.");
    }
   
}

class LandAnimal extends Animal {}

class BirdAnimal extends Animal implements IsFlyable {
    boolean canFly;

   
    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    
    @Override
    public void land() {
        System.out.println(name + " landed.");
    }

    
    public boolean isFlying() {
        return canFly;
    }
}

class WaterAnimal extends Animal implements IsSwimmable {
    boolean canBreathe;

   
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
}