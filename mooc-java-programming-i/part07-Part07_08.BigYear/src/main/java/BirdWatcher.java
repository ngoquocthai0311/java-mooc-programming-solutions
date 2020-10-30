/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

public class BirdWatcher {

    private ArrayList<Bird> birdsDatabase;

    public BirdWatcher() {
        this.birdsDatabase = new ArrayList<Bird>();
    }

    public void add(String name, String nameInLatin) {
        Bird bird = new Bird(name, nameInLatin);
        this.birdsDatabase.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : birdsDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getNameInLatin().equalsIgnoreCase(name)) {
                bird.observations();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birdsDatabase) {
            System.out.println(bird.toString());
        }
    }

    public void printOneBird(String name) {
        for (Bird bird : birdsDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getNameInLatin().equalsIgnoreCase(name)) {
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }

}
