package Loops;

import java.util.Random;

public class Mascota {
    private String name;
    private boolean isDog;
    private int energy;
    private int hygiene;
    private int mood;
    private int weight;

    public Mascota(String nombre, boolean isDog) {
        Random rnd = new Random();
        this.name = name;
        this.isDog = isDog;
        this.energy = 40 + rnd.nextInt(21);
        this.hygiene = 40 + rnd.nextInt(21);
        this.mood = 40 + rnd.nextInt(21);
        this.weight = 40 + rnd.nextInt(21);
    }

    public void sleep() {
        energy += isDog ? 25 : 20;
        mood += 10;
    }

    public void play() {
        energy -= 20;
        mood += 20;
        weight -= 10;
    }

    public void eat() {
        energy += 10;
        hygiene -= 15;
        weight += 10;
    }

    public void clean() {
        if (isDog) {
            energy -= 10;
            hygiene += 25;
            mood -= 15;
        } else {
            energy -= 5;
            hygiene += 25;
            mood += 5;
        }
    }

    public void attack() {
        energy -= 3;
        hygiene -= 3;
        mood -= 3;
    }

    public boolean isDie() {
        return energy <= 0 ||
                hygiene <= 0 ||
                mood <= 0 ||
                weight <= 0
                || energy >= 100 || hygiene >= 100 || mood >= 100 || weight >= 100;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return name + " (" + (isDog ? "dog" : "cat") + ")"
                + " | Energy: " + energy + " | Hygiene: " + hygiene
                + " | Mood: " + mood + " | Weight: " + weight;
    }

}